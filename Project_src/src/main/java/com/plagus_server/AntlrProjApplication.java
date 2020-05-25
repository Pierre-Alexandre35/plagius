package com.plagus_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * The type Antlr proj application.
 */
@SpringBootApplication
public class AntlrProjApplication {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    System.setErr(new PrintStream(new OutputStream() {
      @Override
      public void write(int b) throws IOException {

      }
    }));
     SpringApplication.run(AntlrProjApplication.class, args);
  }

}
