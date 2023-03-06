package com.agileactors.templatemethod;

import java.nio.file.Path;

public class FileSystemContentCounter extends ContentCounter {
  @Override
  protected Path getFilePath(String fileName) {
    return Path.of(fileName);
  }
}
