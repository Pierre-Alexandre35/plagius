package advanced_and_mocking;

import com.plagus_server.webService;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * File pair tests.
 */
public class FilePairTests {
  private MultipartFile getMuliFileFromPath(String fname, List<Path> paths) throws IOException {
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
   * Test comments.
   *
   * @throws IOException the io exception
   */
//@Test
  public void testComments() throws IOException {
    MultipartFile one, two;
    try {

      one = getMuliFileFromPath("one", List.of(
              Path.of("test_data/python/comments/student1/documentationComment.py"),
              Path.of("test_data/python/comments/student1/inlineComment.py"),
              Path.of("test_data/python/comments/student1/insideFuncComment.py"),
              Path.of("test_data/python/comments/student1/outsideFuncComment.py")
      ));

      two = getMuliFileFromPath("two", List.of(
              Path.of("test_data/python/comments/student2/documentationComment.py"),
              Path.of("test_data/python/comments/student2/inlineComment.py"),
              Path.of("test_data/python/comments/student2/insideFuncComment.py"),
              Path.of("test_data/python/comments/student2/outsideFuncComment.py")
      ));

      String result = new webService().postFiles(one, two, "PYTHON");

    } catch (IOException e) {
      Assert.fail(e.getClass().getSimpleName()
              + "\t" + e.getMessage() + "\n");
      e.printStackTrace();
    } finally {

      Files.deleteIfExists(Path.of("one.zip"));
      Files.deleteIfExists(Path.of("two.zip"));
    }
  }

  /**
   * Test func swap.
   *
   * @throws IOException the io exception
   */
  @Test
  public void testFuncSwap() throws IOException {
    MultipartFile one, two;
    try {

      one = getMuliFileFromPath("one", List.of(
              Path.of("test_data/python/funcSwap/student1/swap1with2.py"),
              Path.of("test_data/python/funcSwap/student1/swap1with3.py"),
              Path.of("test_data/python/funcSwap/student1/swap2.py"),
              Path.of("test_data/python/funcSwap/student1/swap2with3.py")
      ));

      two = getMuliFileFromPath("one", List.of(
              Path.of("test_data/python/funcSwap/student2/swap1with2.py"),
              Path.of("test_data/python/funcSwap/student2/swap1with3.py"),
              Path.of("test_data/python/funcSwap/student2/swap2.py"),
              Path.of("test_data/python/funcSwap/student2/swap2with3.py")
      ));

      String result = new webService().postFiles(one, two, "PYTHON");
//      Report report = new Gson().fromJson(result, Report.class);

    } catch (IOException e) {
      Assert.fail(e.getClass().getSimpleName()
              + "\t" + e.getMessage() + "\n");
      e.printStackTrace();
    } finally {

      Files.deleteIfExists(Path.of("one.zip"));
      Files.deleteIfExists(Path.of("two.zip"));
    }
  }

  /**
   * Test lcs multi file.
   *
   * @throws IOException the io exception
   */
  @Test
  public void testLCSMultiFile() throws IOException {
    MultipartFile one, two;
    try {

      one = getMuliFileFromPath("one", List.of(
              Path.of("test_data/python/lcs_multiFile/student1/foo.py"),
              Path.of("test_data/python/lcs_multiFile/student1/main.py")
      ));

      two = getMuliFileFromPath("one", List.of(
              Path.of("test_data/python/lcs_multiFile/student2/foo.py"),
              Path.of("test_data/python/lcs_multiFile/student2/main.py")
      ));

      String result = new webService().postFiles(one, two, "PYTHON");
//      Report report = new Gson().fromJson(result, Report.class);

    } catch (IOException e) {
      Assert.fail(e.getClass().getSimpleName()
              + "\t" + e.getMessage() + "\n");
      e.printStackTrace();
    } finally {

      Files.deleteIfExists(Path.of("one.zip"));
      Files.deleteIfExists(Path.of("two.zip"));
    }
  }

  /**
   * Test lcs single file.
   *
   * @throws IOException the io exception
   */
  @Test
  public void testLCSSingleFile() throws IOException {
    MultipartFile one, two;
    try {

      one = getMuliFileFromPath("one", List.of(
              Path.of("test_data/python/lcs_singleFile/student1/fullyIdentical.py"),
              Path.of("test_data/python/lcs_singleFile/student1/sameFuncBody.py"),
              Path.of("test_data/python/lcs_singleFile/student1/sameFuncDef.py")
      ));

      two = getMuliFileFromPath("one", List.of(
              Path.of("test_data/python/lcs_singleFile/student2/fullyIdentical.py"),
              Path.of("test_data/python/lcs_singleFile/student2/sameFuncBody.py"),
              Path.of("test_data/python/lcs_singleFile/student2/sameFuncDef.py")
      ));

      String result = new webService().postFiles(one, two, "PYTHON");
//      Report report = new Gson().fromJson(result, Report.class);

    } catch (IOException e) {
      Assert.fail(e.getClass().getSimpleName()
              + "\t" + e.getMessage() + "\n");
      e.printStackTrace();
    } finally {

      Files.deleteIfExists(Path.of("one.zip"));
      Files.deleteIfExists(Path.of("two.zip"));
    }
  }

  /**
   * Test small edits.
   *
   * @throws IOException the io exception
   */
  @Test
  public void testSmallEdits() throws IOException {
    MultipartFile one, two;
    try {

      one = getMuliFileFromPath("one", List.of(
              Path.of("test_data/python/smallEdits/student1/renameAllParams.py"),
              Path.of("test_data/python/smallEdits/student1/renameEverything.py"),
              Path.of("test_data/python/smallEdits/student1/renameFuncName.py"),
              Path.of("test_data/python/smallEdits/student1/renameSingleParam.py"),
              Path.of("test_data/python/smallEdits/student1/renameSingleVar.py")
      ));

      two = getMuliFileFromPath("one", List.of(
              Path.of("test_data/python/smallEdits/student2/renameAllParams.py"),
              Path.of("test_data/python/smallEdits/student2/renameEverything.py"),
              Path.of("test_data/python/smallEdits/student2/renameFuncName.py"),
              Path.of("test_data/python/smallEdits/student2/renameSingleParam.py"),
              Path.of("test_data/python/smallEdits/student2/renameSingleVar.py")
      ));

      String result = new webService().postFiles(one, two, "PYTHON");
//      Report report = new Gson().fromJson(result, Report.class);

    } catch (IOException e) {
      Assert.fail(e.getClass().getSimpleName()
              + "\t" + e.getMessage() + "\n");
      e.printStackTrace();
    } finally {

      Files.deleteIfExists(Path.of("one.zip"));
      Files.deleteIfExists(Path.of("two.zip"));
    }
  }

  /**
   * Test misc.
   *
   * @throws IOException the io exception
   */
  @Test
  public void testMisc() throws IOException {
    MultipartFile one, two;
    try {

      one = getMuliFileFromPath("one", List.of(
              Path.of("test_data/python/misc/student1/py_file_1.py"),
              Path.of("test_data/python/misc/student1/singleStmtFun.py"),
              Path.of("test_data/python/misc/student1/testFuns.py")
      ));

      two = getMuliFileFromPath("one", List.of(
              Path.of("test_data/python/misc/student2/plagiarisation.py"),
              Path.of("test_data/python/misc/student2/singleStmtFun.py"),
              Path.of("test_data/python/misc/student2/py_file_2.py")
      ));

      String result = new webService().postFiles(one, two, "PYTHON");
//      Report report = new Gson().fromJson(result, Report.class);

    } catch (IOException e) {
      Assert.fail(e.getClass().getSimpleName()
              + "\t" + e.getMessage() + "\n");
      e.printStackTrace();
    } finally {

      Files.deleteIfExists(Path.of("one.zip"));
      Files.deleteIfExists(Path.of("two.zip"));
    }
  }


}
