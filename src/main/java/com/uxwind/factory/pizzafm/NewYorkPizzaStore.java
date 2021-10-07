package com.uxwind.factory.pizzafm;

public class NewYorkPizzaStore extends PizzaStore {
  protected Pizza createPizza(Pizza.Type type) {
    switch (type) {
      case CHEESE:
        return new NewYorkStyleCheesePizza();
      case VEGGIE:
        return new NewYorkStyleVeggiePizza();
      case CLAM:
        return new NewYorkStyleClamPizza();
      case PEPPERONI:
        return new NewYorkStylePepperoniPizza();
      default:
        throw new IllegalStateException("Unexpected value: " + type);
    }
  }
}
