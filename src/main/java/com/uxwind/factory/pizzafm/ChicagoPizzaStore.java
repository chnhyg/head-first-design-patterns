package com.uxwind.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {
  protected Pizza createPizza(Pizza.Type type) {
    switch (type) {
      case CHEESE:
        return new ChicagoStyleCheesePizza();
      case VEGGIE:
        return new ChicagoStyleVeggiePizza();
      case CLAM:
        return new ChicagoStyleClamPizza();
      case PEPPERONI:
        return new ChicagoStylePepperoniPizza();
      default:
        throw new IllegalStateException("Unexpected value: " + type);
    }
  }
}
