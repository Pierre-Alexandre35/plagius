package advanced_and_mocking;

import com.google.gson.Gson;

import com.plagus_server.common.Language;
import com.plagus_server.controller.reporting.Report;
import com.plagus_server.util.GsonToken;
import com.plagus_server.util.PathDeserializer;
import com.plagus_server.webService;

import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static org.junit.Assert.fail;

/**
 * Mini test framework. Framework for generating compatible zip files
 */
public class MiniTestFramework {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   * @throws IOException the io exception
   */
  public static void main(String[] args) throws IOException {
    runJs();
    runPython();
    String prefix3 = "res/Sample-code/";
    Language lang = Language.PYTHON;


    var l1 = List.of(Path.of(prefix3 + "pyDemo1.py"));
    var l2 = List.of(Path.of(prefix3 + "pyDemo2.py"));
    runTwoFolders(l1, l2, Path.of("res/main.txt"), lang);
  }

  /**
   * Run python.
   *
   * @throws IOException the io exception
   */
  static void runPython() throws IOException {
    pythonCross(Path.of("res/err/Python/OneFile/"), Path.of("res/err/py_/"));
    pythonCross(Path.of("res/err/Python/MultiFile"), Path.of("res/err/py_/"));
  }

  private static void pythonCross(Path p, Path targetDir) throws IOException {
    Path single = p;
    List<Path> paths = Files.list(single)
            .filter(e -> e.toString().endsWith(Language.PYTHON.getExt()))
            .collect(Collectors.toList());
    for (Path outer : paths) {
      for (Path inner : paths) {
        runTwoFolders(List.of(outer),
                List.of(inner),
                Path.of(targetDir.toString() + "/reports/" + fileName(outer) + "_" + fileName(inner) + ".txt"),
                Language.PYTHON);
      }
    }
  }

  /**
   * File name string.
   *
   * @param path the path
   * @return the string
   */
  static String fileName(Path path) {
    return path.getName(path.getNameCount() - 1).toString().replace(".py", "");
  }


  /**
   * Run js.
   *
   * @throws IOException the io exception
   */
  static void runJs() throws IOException {
    Path jsSingle = Path.of("res/err/JS/Singlefile");
    Path jsMulti = Path.of("res/err/JS/Multifile");
    runAll(jsSingle, false);
    runAll(jsMulti, true);
  }

  /**
   * Run all.
   *
   * @param strategies the strategies
   * @param isMulti    the is multi
   * @throws IOException the io exception
   */
  static void runAll(Path strategies, boolean isMulti) throws IOException {
    System.out.println(strategies);
    List<Path> strats = Files.list(strategies)
            .filter(Files::isDirectory)
            .collect(Collectors.toList());
    for (Path strat : strats) {
      runStrategy(strat, isMulti);
    }
  }

  /**
   * Run strategy.
   *
   * @param stratPath the strat path
   * @param isMulti   the is multi
   * @throws IOException the io exception
   */
  static void runStrategy(Path stratPath, boolean isMulti) throws IOException {
    Path stratReport = Path.of(stratPath.getParent().getParent().toString()
            + "/reports/" + stratPath.getName(stratPath.getNameCount() - 1) + ".txt");
    List<Path> ls = Files.list(stratPath)
            .collect(Collectors.toList());
    System.out.println(stratPath);
    System.out.println();
    boolean zeroIsOne = ls.get(0).toString().endsWith("1");

    if (!isMulti) {
      if (zeroIsOne) {
        runTwoFolders(List.of(ls.get(0)), List.of(ls.get(1)), stratReport, Language.JAVASCRIPT);
      } else {
        runTwoFolders(List.of(ls.get(1)), List.of(ls.get(0)), stratReport, Language.JAVASCRIPT);
      }
      return;
    }
    if (ls.stream()

            .filter(Files::isDirectory).count() < 2) {
      return;
    }
    try {
      if (zeroIsOne) {
        runTwoFolders(Files.list(ls.get(0))
                        .collect(Collectors.toList()),
                Files.list(ls.get(1))
                        .collect(Collectors.toList()),
                stratReport, Language.JAVASCRIPT);
      } else {
        runTwoFolders(Files.list(ls.get(1))

                        .collect(Collectors.toList()),
                Files.list(ls.get(0))


                        .collect(Collectors.toList()),
                stratReport, Language.JAVASCRIPT);
      }
    } catch (FileNotFoundException e) {
      System.out.println("FNF caught from run two folders call");
    } catch (IOException e) {
      System.out.println("IOE caught from run two folders call" + e.getMessage() + "  " + stratPath);
      e.printStackTrace();
    }
  }

  /**
   * Run two folders.
   *
   * @param one    the one
   * @param two    the two
   * @param target the target
   * @param lang   the lang
   * @throws IOException the io exception
   */
  static void runTwoFolders(List<Path> one, List<Path> two, Path target, Language lang) throws IOException {
    MultipartFile fOne, fTwo;
    Files.deleteIfExists(target);

    try (FileWriter fileWriter = new FileWriter(target.toFile());
         PrintWriter pw = new PrintWriter(fileWriter)) {
      fOne = getMuliFileFromPath("one", one);

      fTwo = getMuliFileFromPath("two", two);

      String result = new webService().postFiles(fOne, fTwo, lang.toString());

      pw.println("\t-----Submissions-----\n\n");
      pw.println(result);
      pw.flush();


    } catch (IndexOutOfBoundsException e) {
      fail();
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        Files.deleteIfExists(Path.of("one.zip"));
        Files.deleteIfExists(Path.of("two.zip"));
      } catch (IOException e) {
        System.out.println("could not delete zips");
      }
    }
  }

  private static MultipartFile getMuliFileFromPath(String fname, List<Path> paths) throws IOException {
    Path zip = writeManyPathToZip(paths, Optional.of(fname + ".zip"));
    byte[] bytes = Files.readAllBytes(zip);
    return new MockMultipartFile(fname, bytes);
  }

  /**
   * Create multi file multipart file.
   *
   * @param filename the filename
   * @param files    the files
   * @param ext      the ext
   * @return the multipart file
   * @throws IOException the io exception
   */
  public static MultipartFile createMultiFile(String filename, List<String> files, String ext) throws IOException {
    String base = "baseString";
    int count = 0;
    List<File> fileList = new ArrayList<>();
    for (String file : files) {
      fileList.add(writeStringToFile(base + count + ext, file));
      count++;
    }
    File zip = writeManyFileToZip(fileList, Optional.empty());
    return new MockMultipartFile(filename, Files.readAllBytes(zip.toPath()));

  }

  /**
   * Write many path to zip path.
   *
   * @param files    the files
   * @param fileName the file name
   * @return the path
   * @throws IOException the io exception
   */
  public static Path writeManyPathToZip(List<Path> files, Optional<String> fileName) throws IOException {
    return writeManyFileToZip(files.stream().map(Path::toFile).collect(Collectors.toList()), fileName).toPath();
  }

  /**
   * Write many file to zip file.
   *
   * @param files    the files
   * @param fileName the file name
   * @return the file
   * @throws IOException the io exception
   */
  public static File writeManyFileToZip(List<File> files, Optional<String> fileName) throws IOException {
    var x = new File(fileName.orElse("file.zip"));
    FileOutputStream fos = new FileOutputStream(x);
    ZipOutputStream zipOS = new ZipOutputStream(fos);


    for (File file : files) {
      writeFileToZip(file, zipOS);
    }

    zipOS.close();
    fos.close();
    return x;
  }

  private static void writeFileToZip(File f, ZipOutputStream zout) throws IOException {

    FileInputStream fis = new FileInputStream(f);
    ZipEntry zipEntry = new ZipEntry(f.toPath().toString());
    zout.putNextEntry(zipEntry);

    byte[] bytes = new byte[1024];
    int length;
    while ((length = fis.read(bytes)) >= 0) {
      zout.write(bytes, 0, length);
    }

    zout.closeEntry();
    fis.close();
  }

  private static File writeStringToFile(String fname, String data) throws IOException {
    Path path = Path.of(fname);
    Files.deleteIfExists(path);
    Files.writeString(path, data + "\n");
    return path.toFile();
  }

  /**
   * Comment test.
   *
   * @throws IOException the io exception
   */
  @Test
  public void commentTest() throws IOException {
    MultipartFile one, two;
    try {
      one = getMuliFileFromPath("one", List.of(
              Path.of("test_data/python/funcSwap/student1/swap1with3.py")));

      two = getMuliFileFromPath("two", List.of(
              Path.of("test_data/python/funcSwap/student1/swap1with2.py")));

      String result = new webService().postFiles(one, two, "PYTHON");
      Report report = new Gson().newBuilder()
              .registerTypeAdapter(Token.class, new GsonToken())
              .registerTypeAdapter(Path.class, new PathDeserializer())
              .create()
              .fromJson(result, Report.class);
      System.out.println(result);
    } catch (Exception e) {
      fail(e.getClass().getSimpleName()
              + "\t" + e.getMessage() + "\n");
      e.printStackTrace();
    } finally {

      Files.deleteIfExists(Path.of("one.zip"));
      Files.deleteIfExists(Path.of("two.zip"));
    }
  }


}

