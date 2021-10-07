package com.uxwind.factory.pizzaaf;

public class PepperoniPizza extends Pizza {
  private final PizzaIngredientFactory factory;

  public PepperoniPizza(PizzaIngredientFactory factory) {
    this.factory = factory;
  }

  public void prepare() {
    System.out.println("Preparing " + name + ".");
    dough = factory.createDough();
    sauce = factory.createSauce();
    cheese = factory.createCheese();
    veggies = factory.createVeggies();
    pepperoni = factory.createPepperoni();
  }
}
