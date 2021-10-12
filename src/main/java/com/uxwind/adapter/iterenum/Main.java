package com.uxwind.adapter.iterenum;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Vector<String> vector = new Vector<>(Arrays.asList("Hello Kitty", "My Melody"));
    Iterator<?> iterator = new EnumerationIterator(vector.elements());
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Hello Kitty", "My Melody"));
    Enumeration<?> enumeration = new IteratorEnumeration(arrayList.iterator());
    while (enumeration.hasMoreElements()) {
      System.out.println(enumeration.nextElement());
    }
  }
}
