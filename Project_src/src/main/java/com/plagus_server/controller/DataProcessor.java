package com.plagus_server.controller;

import com.plagus_server.common.Language;
import com.plagus_server.controller.reporting.Report;

import org.springframework.web.multipart.MultipartFile;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * The type Data processor.
 */
class DataProcessor implements DataFlow {
  private final FileSystem zipFs1;
  private final FileSystem zipFs2;
  private final List<Closeable> closeables;
  private final Language lang;
  private Path rootPath1;
  private Path rootPath2;
  private List<Path> srcCode1;
  private List<Path> srcCode2;
  private Map<Path, PrimitiveByteArray> dataMap1;
  private Map<Path, PrimitiveByteArray> dataMap2;
  private boolean dataBuilt;

  /**
   * Instantiates a new Data processor.
   *
   * @param zip1 the zip 1
   * @param zip2 the zip 2
   * @param lang the lang
   * @throws IOException the io exception
   */
  DataProcessor(MultipartFile zip1, MultipartFile zip2, Language lang) throws IOException {
    var tmp1 = Path.of("temp1");
    var tmp2 = Path.of("temp2");
    zip1.transferTo(tmp1);
    zip2.transferTo(tmp2);
    closeables = new ArrayList<>();
    zipFs1 = FileSystems.newFileSystem(tmp1, null);
    zipFs2 = FileSystems.newFileSystem(tmp2, null);
    closeables.add(zipFs1);
    closeables.add(zipFs2);
    this.lang = lang;
    dataBuilt = false;
  }

  private static Map<Path, PrimitiveByteArray> createDataMap(List<Path> srcCode) {
    return srcCode.stream()
            .collect(Collectors.toMap(Function.identity(),
                    v -> {
                      try {
                        return new PrimitiveByteArray(Files.readAllBytes(v));
                      } catch (IOException e) {
                        return null;
                      }
                    }));
  }

  @Override
  public void buildInputData() throws IOException, IllegalArgumentException, IllegalStateException {
    rootPath1 = zipFs1
            .getRootDirectories()
            .iterator().next().toAbsolutePath();
    rootPath2 = zipFs2
            .getRootDirectories()
            .iterator().next()
            .toAbsolutePath();
    srcCode1 = Files.walk(rootPath1)
            .collect(Collectors.toList())
            .stream()
            .filter(path -> path.toString().endsWith(lang.getExt()))
            .collect(Collectors.toList());
    srcCode2 = Files.walk(rootPath2)
            .collect(Collectors.toList())
            .stream()
            .filter(path -> path.toString().endsWith(lang.getExt()))
            .collect(Collectors.toList());
    dataMap1 = createDataMap(srcCode1);
    dataMap2 = createDataMap(srcCode2);
    dataBuilt = true;
  }

  @Override
  public Report generateReport() throws IllegalStateException, IllegalArgumentException, IOException {
    if (!dataBuilt) {
      throw new IllegalStateException("build data before attempting to generate a report");
    }

    return Report.builder(lang)
            .setData(dataMap1)
            .setData(dataMap2)
            .generateASTNodeCount()
            .generateCommentReport()
            .generateFunctionAnalysis()
            .setLCSReport()
            .createReport();

  }

  @Override
  public void close() throws IOException {
    try {
      for (Closeable closeable : closeables) {
        closeable.close();
      }
      Files.deleteIfExists(Path.of("temp1"));
      Files.deleteIfExists(Path.of("temp2"));
    } catch (IOException e) {
      e.getMessage();
    } catch (Exception e) {
      e.getMessage();
    }
  }

}
