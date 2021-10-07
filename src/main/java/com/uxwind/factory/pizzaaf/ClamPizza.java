package com.uxwind.factory.pizzaaf;

public class ClamPizza extends Pizza {
  private final PizzaIngredientFactory factory;

  public ClamPizza(PizzaIngredientFactory factory) {
    this.factory = factory;
  }

  public void prepare() {
    System.out.println("Preparing " + name + ".");
    dough = factory.createDough();
    sauce = factory.createSauce();
    cheese = factory.createCheese();
    clams = factory.createClam();
  }
}
