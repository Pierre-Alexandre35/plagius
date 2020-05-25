package com.plagus_server;

import com.plagus_server.common.Language;
import com.plagus_server.controller.DataFlow;
import com.plagus_server.controller.reporting.Report;
import com.plagus_server.util.PlagusGSON;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


/**
 * The service contains our API endpoints
 */
@RestController
public class webService {


  /**
   * This API endpoint receives 2 files from the front end, and makes them digestible for our
   * ANTLR processing
   *
   * @param input1 file 1
   * @param input2 file 2
   * @return string
   */
  @CrossOrigin(origins = "*")
  @PostMapping("/postFiles")
  public String postFiles(
          @RequestParam("file1") MultipartFile input1,
          @RequestParam("file2") MultipartFile input2,
          @RequestParam("fileType") String fileType) {
     Report expectedReport = null;
    String json = "";
    try (DataFlow dfc = DataFlow.ofDefault(input1, input2, Language.valueOf(fileType))) {
      dfc.buildInputData();
      expectedReport = dfc.generateReport();
      json = PlagusGSON.getInstance()
              .toGsString(expectedReport, Report.class);
    } catch (IOException e) {
      e.printStackTrace();
      return e.getMessage();
    }
    System.out.println(json);

    return json;

  }


}
