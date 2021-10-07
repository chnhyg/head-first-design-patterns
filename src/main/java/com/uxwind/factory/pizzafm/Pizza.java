package com.uxwind.factory.pizzafm;

import java.util.ArrayList;

public abstract class Pizza {
  public enum Type {
    CHEESE,
    CLAM,
    PEPPERONI,
    VEGGIE,
  }

  protected String name;
  protected String dough;
  protected String sauce;
  protected ArrayList<String> toppings = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void prepare() {
    System.out.println("Prepare " + name + ".");
    System.out.println("Tossing dough ...");
    System.out.println("Adding sauce ...");
    System.out.println("Adding toppings: ");
    for (String topping : toppings) {
      System.out.println("   " + topping);
    }
  }

  public void bake() {
    System.out.println("Bake for 25 minutes at 350.");
  }

  public void cut() {
    System.out.println("Cut the pizza into diagonal slices.");
  }

  public void box() {
    System.out.println("Place pizza in official PizzaStore box.");
  }

  public String toString() {
    StringBuilder display = new StringBuilder();
    display.append("---- ").append(name).append(" ----\n");
    display.append(dough).append("\n");
    display.append(sauce).append("\n");
    for (String topping : toppings) {
      display.append(topping).append("\n");
    }
    return display.toString();
  }
}