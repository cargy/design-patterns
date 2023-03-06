package com.agileactors.templatemethod;

import java.net.URISyntaxException;
import java.nio.file.Path;

public class ClasspathContentCounter extends ContentCounter {
  @Override
  protected Path getFilePath(String fileName) {
    try {
      var fileUrl = ClassLoader.getSystemClassLoader().getResource(fileName);

      return Path.of(fileUrl.toURI());

    } catch (URISyntaxException e) {
      throw new RuntimeException(e);
    }
  }
}
