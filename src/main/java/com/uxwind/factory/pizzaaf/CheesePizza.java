package com.uxwind.factory.pizzaaf;

public class CheesePizza extends Pizza {
  private final PizzaIngredientFactory factory;

  public CheesePizza(PizzaIngredientFactory factory) {
    this.factory = factory;
  }

  public void prepare() {
    System.out.println("Preparing " + name + ".");
    dough = factory.createDough();
    sauce = factory.createSauce();
    cheese = factory.createCheese();
  }
}
