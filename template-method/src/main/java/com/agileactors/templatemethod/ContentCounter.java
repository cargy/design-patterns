package com.agileactors.templatemethod;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class ContentCounter {

  public int countAndPrint(String fileName) {

    // step1: mandatory implemented by the subclass,
    var filePath = getFilePath(fileName);

    // step2: mandatory implemented by the abstract class
    var content = getContent(filePath);

    // step3: mandatory implemented by the abstract class
    var count = countCharacters(content);

    // step4: mandatory implemented by the abstract class
    printContent(content, count);

    return count;
  }

  protected abstract Path getFilePath(String fileName);

  private String getContent(Path filePath) {
    try {
      return Files.readAllLines(filePath)
          .stream()
          .reduce(String::concat).orElse("");

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private int countCharacters(String content) {
    return content.replaceAll(" ", "").length();
  }

  private void printContent(String content, int count) {
    System.out.println(content + " has " + count + " characters");
  }

}
