package com.uxwind.proxy.javaproxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class Main {
  private final HashMap<String, Person> datingDatabase = new HashMap<>();

  public static void main(String[] args) {
    new Main().drive();
  }

  public Main() {
    initializeDatabase();
  }

  private void initializeDatabase() {
    Person kitty = new PersonImpl();
    kitty.setName("Hello Kitty");
    kitty.setInterests("English, music, art");
    kitty.setGeekRating(7);
    datingDatabase.put(kitty.getName(), kitty);
  }

  public void drive() {
    Person kitty = getPersonFromDatabase("Hello Kitty");

    Person nonOwnerProxy = getNonOwnerProxy(kitty);
    System.out.println("Name is " + nonOwnerProxy.getName() + ".");
    try {
      nonOwnerProxy.setInterests("bowling");
    } catch (Exception e) {
      System.out.println("Can't set interests from non owner proxy.");
    }
    nonOwnerProxy.setGeekRating(10);
    System.out.println("Rating set from non owner proxy.");
    System.out.println("Rating is " + nonOwnerProxy.getGeekRating() + ".");
  }

  private Person getPersonFromDatabase(String name) {
    return datingDatabase.get(name);
  }

  private Person getOwnerProxy(Person person) {
    return (Person)
        Proxy.newProxyInstance(
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new OwnerInvocationHandler(person));
  }

  private Person getNonOwnerProxy(Person person) {
    return (Person)
        Proxy.newProxyInstance(
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new NonOwnerInvocationHandler(person));
  }
}
