package com.uxwind.factory.pizzaaf;

public class VeggiePizza extends Pizza {
  private final PizzaIngredientFactory factory;

  public VeggiePizza(PizzaIngredientFactory factory) {
    this.factory = factory;
  }

  public void prepare() {
    System.out.println("Preparing " + name + ".");
    dough = factory.createDough();
    sauce = factory.createSauce();
    cheese = factory.createCheese();
    veggies = factory.createVeggies();
  }
}
