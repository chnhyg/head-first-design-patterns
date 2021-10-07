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

  public void setName(String name) {
    this.name = name;
  }

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
    StringBuilder result = new StringBuilder();
    result.append("---- ").append(name).append(" ----\n");
    result.append(dough).append("\n");
    result.append(sauce).append("\n");
    for (String topping : toppings) {
      result.append(topping).append("\n");
    }
    return result.toString();
  }
}
