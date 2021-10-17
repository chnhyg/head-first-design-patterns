package com.uxwind.iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {
  private final ArrayList<MenuItem> items;

  public PancakeHouseMenu() {
    items = new ArrayList<>();
    addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
    addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
    addItem(
        "Blueberry Pancakes",
        "Pancakes made with fresh blueberries and blueberry syrup",
        true,
        3.49);
    addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    items.add(new MenuItem(name, description, vegetarian, price));
  }

  public List<MenuItem> getItems() {
    return items;
  }

  public Iterator<MenuItem> createIterator() {
    return items.iterator();
  }
}
