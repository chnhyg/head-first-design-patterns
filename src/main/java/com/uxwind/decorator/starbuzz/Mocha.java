package com.uxwind.decorator.starbuzz;

public class Mocha extends CondimentDecorator {
  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return String.format("%s, Mocha", beverage.getDescription());
  }

  public double cost() {
    return beverage.cost() + .20;
  }
}
