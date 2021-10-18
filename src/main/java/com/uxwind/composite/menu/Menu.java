package com.uxwind.composite.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
  private final ArrayList<MenuComponent> menuComponents;
  private String name;
  private String description;

  public Menu(String name, String description) {
    this.menuComponents = new ArrayList<>();
    this.name = name;
    this.description = description;
  }

  public void add(MenuComponent menuComponent) {
    menuComponents.add(menuComponent);
  }

  public void remove(MenuComponent menuComponent) {
    menuComponents.remove(menuComponent);
  }

  public MenuComponent getChild(int i) {
    return menuComponents.get(i);
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public void print() {
    System.out.println();
    System.out.println(getName() + ", " + getDescription());
    System.out.println("--------");
    for (MenuComponent menuComponent : menuComponents) {
      menuComponent.print();
    }
  }
}
