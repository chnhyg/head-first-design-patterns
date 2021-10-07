package com.uxwind.factory.pizzaaf;

public class ChicagoPizzaStore extends PizzaStore {
  protected Pizza createPizza(Pizza.Type type) {
    PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
    Pizza pizza = null;
    switch (type) {
      case CHEESE:
        pizza = new CheesePizza(factory);
        pizza.setName("Chicago Style Cheese Pizza");
        break;
      case VEGGIE:
        pizza = new VeggiePizza(factory);
        pizza.setName("Chicago Style Veggie Pizza");
        break;
      case CLAM:
        pizza = new ClamPizza(factory);
        pizza.setName("Chicago Style Clam Pizza");
        break;
      case PEPPERONI:
        pizza = new PepperoniPizza(factory);
        pizza.setName("Chicago Style Pepperoni Pizza");
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + type);
    }
    return pizza;
  }
}
