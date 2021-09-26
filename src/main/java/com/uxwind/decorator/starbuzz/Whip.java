package com.uxwind.decorator.starbuzz;

public class Whip extends CondimentDecorator {
  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return String.format("%s, Whip", beverage.getDescription());
  }

  public double cost() {
    return beverage.cost() + .10;
  }
}
