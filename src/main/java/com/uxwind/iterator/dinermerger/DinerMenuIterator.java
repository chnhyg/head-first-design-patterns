package com.uxwind.iterator.dinermerger;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
  private final MenuItem[] items;
  private int position = 0;

  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }

  public MenuItem next() {
    return items[position++];
  }

  public boolean hasNext() {
    return position < items.length && items[position] != null;
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}
