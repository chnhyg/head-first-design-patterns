package com.uxwind.iterator.menu;

import java.util.Iterator;

public class Waitress {
  private final Menu pancakeHouseMenu;
  private final Menu dinerMenu;
  private final Menu cafeMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
    this.cafeMenu = cafeMenu;
  }

  public void printMenu() {
    System.out.println("MENU");
    System.out.println("----");
    printMenu(pancakeHouseMenu.createIterator());
    printMenu(dinerMenu.createIterator());
    printMenu(cafeMenu.createIterator());
  }

  private void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem item = iterator.next();
      System.out.print(item.getName() + ", ");
      System.out.print(item.getPrice() + " -- ");
      System.out.println(item.getDescription());
    }
  }

  public void printVegetarianMenu() {
    System.out.println("VEGETARIAN MENU");
    System.out.println("---------------");
    printVegetarianMenu(pancakeHouseMenu.createIterator());
    printVegetarianMenu(dinerMenu.createIterator());
    printVegetarianMenu(cafeMenu.createIterator());
  }

  private void printVegetarianMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem item = iterator.next();
      if (item.isVegetarian()) {
        System.out.print(item.getName() + ", ");
        System.out.print(item.getPrice() + " -- ");
        System.out.println(item.getDescription());
      }
    }
  }

  public boolean isVegetarian(String name) {
    Iterator<MenuItem> pancakeHouseIterator = pancakeHouseMenu.createIterator();
    if (isVegetarian(name, pancakeHouseIterator)) {
      return true;
    }
    Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
    if (isVegetarian(name, dinerIterator)) {
      return true;
    }
    Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
    if (isVegetarian(name, cafeIterator)) {
      return true;
    }
    return false;
  }

  private boolean isVegetarian(String name, Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem item = iterator.next();
      if (item.getName().equals(name)) {
        if (item.isVegetarian()) {
          return true;
        }
      }
    }
    return false;
  }
}
