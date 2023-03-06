package com.agileactors;

import com.agileactors.templatemethod.ClasspathContentCounter;
import com.agileactors.templatemethod.FileSystemContentCounter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// read one file and count the characters of the content
public class Main {
  public static void main(String[] args) throws IOException {
    new FileSystemContentCounter().countAndPrint("/tmp/content.txt");
    new ClasspathContentCounter().countAndPrint("content.txt");
  }

  // initial thinking, that doesn't scale that much
  private static void readFileAndCount() throws IOException {
    // to read data from classpath find the absolute path
    // if it is a read from filesystem, if b read from classpath, if c read from ftp, if z read from
    var content = Files.readAllLines(Paths.get("/tmp/content.txt"))
        .stream().reduce(String::concat).orElse("");

    print(content);
  }

  private static void print(String content) {
    System.out.printf("content %s has %s chars", content, countCharacters(content));

  }

  private static int countCharacters(String content) {
    return content.replaceAll(" ", "").length();
  }
}
