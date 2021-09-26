package com.uxwind.decorator.starbuzz;

public class Milk extends CondimentDecorator {
  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return String.format("%s, Milk", beverage.getDescription());
  }

  public double cost() {
    return beverage.cost() + .10;
  }
}
