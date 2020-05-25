package ControllerTesting;


import com.plagus_server.webService;

import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Controller input testing.
 */
public class ControllerInputTesting {
  private com.plagus_server.webService webService = new webService();
  private File file1, file2;
  private MultipartFile mf1, mf2;
  private String prefix = "test_data/zips/";
  private String test1;
  private String test2;

  /**
   * Sets .
   */
  @Before
  public void setup() {
    file1 = null;
    file2 = null;
    mf1 = null;
    mf2 = null;
    test1 = prefix;
    test2 = prefix;
  }

  /**
   * One file test.
   *
   * @throws IOException the io exception
   */
  @Test
  public void oneFileTest() throws IOException {

    test1 += "oneFile1.zip";
    test2 += "oneFile2.zip";

    file1 = new File(test1);
    file2 = new File(test2);
    mf1 = new MockMultipartFile(file1.getName(), new FileInputStream(file1));
    mf2 = new MockMultipartFile(file2.getName(), new FileInputStream(file2));
    String actual = webService.postFiles(mf1, mf2, "python".toUpperCase());
    assertEquals("", actual);

  }


  /**
   * Top level only test.
   *
   * @throws IOException the io exception
   */
  @Test
  public void topLevelOnlyTest() throws IOException {
    test1 += "topLevel2.zip";
    test2 += "topLevel2.zip";

    file1 = new File(test1);
    file2 = new File(test2);
    mf1 = new MockMultipartFile(file1.getName(), new FileInputStream(file1));
    mf2 = new MockMultipartFile(file2.getName(), new FileInputStream(file2));
    String actual = webService.postFiles(mf1, mf2, "python".toUpperCase());
    assertEquals("", actual);

  }


  /**
   * Has readme test.
   *
   * @throws IOException the io exception
   */
  @Test
  public void hasREADMETest() throws IOException {
    test1 += "hasReadme1.zip";
    test2 += "hasReadme2.zip";

    file1 = new File(test1);
    file2 = new File(test2);
    mf1 = new MockMultipartFile(file1.getName(), new FileInputStream(file1));
    mf2 = new MockMultipartFile(file2.getName(), new FileInputStream(file2));
    String actual = webService.postFiles(mf1, mf2, "python".toUpperCase());
    assertEquals("", actual);

  }


  /**
   * Has top level dir.
   *
   * @throws IOException the io exception
   */
  @Test
  public void hasTopLevelDir() throws IOException {
    test1 += "hasDir1.zip";
    test2 += "hasDir2.zip";

    file1 = new File(test1);
    file2 = new File(test2);
    mf1 = new MockMultipartFile(file1.getName(), new FileInputStream(file1));
    mf2 = new MockMultipartFile(file2.getName(), new FileInputStream(file2));
    String actual = webService.postFiles(mf1, mf2, "python".toUpperCase());
    assertEquals("", actual);
  }
}



