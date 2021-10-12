package com.uxwind.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration<Object> {
  private final Iterator<?> iterator;

  public IteratorEnumeration(Iterator<?> iterator) {
    this.iterator = iterator;
  }

  public boolean hasMoreElements() {
    return iterator.hasNext();
  }

  public Object nextElement() {
    return iterator.next();
  }
}
