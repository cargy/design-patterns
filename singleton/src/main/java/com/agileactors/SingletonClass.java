package com.agileactors;

import java.util.ArrayList;
import java.util.List;

public class SingletonClass {

  private static SingletonClass instance;
  private final List<Object> myLocalState = new ArrayList<>();

  public static SingletonClass getInstance() {
    // 10 threads
    // 11th thread
    if (instance == null) {
      // 5 threads
      instance = new SingletonClass();
      // only 1 instance -> this one
    }
    return instance;
  }

  public void add(Object object) {
    myLocalState.add(object);
  }

  public void remove(int index) {
    synchronized (myLocalState) {
      if (myLocalState.size() < index + 1) {
        return;
      }
      myLocalState.remove(index);
    }

  }

  public void print() {
    System.out.println(myLocalState);
  }
}
