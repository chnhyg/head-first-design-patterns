package com.uxwind.singleton.threadsafe;

public final class Singleton {
  private static Singleton uniqueInstance;

  private Singleton() {}

  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }
}
