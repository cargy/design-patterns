package com.agileactors;

import java.util.concurrent.Executors;

public class Main {

  public static void main(String[] args) {
    var singletonClass = SingletonClass.getInstance();
    var singletonEnum = SingletonEnum.INSTANCE;

    var writeExecutor = Executors.newFixedThreadPool(2);
    var removeExecutor = Executors.newFixedThreadPool(10);

    // Concurrent access is not guaranteed
    while (true) {
      writeExecutor.execute(() -> singletonClass.add("Random"));
      removeExecutor.execute(() -> singletonClass.remove(0));
    }
  }

}
