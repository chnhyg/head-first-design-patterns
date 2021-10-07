package com.uxwind.factory.pizzaaf;

public class NewYorkPizzaStore extends PizzaStore {
  protected Pizza createPizza(Pizza.Type type) {
    PizzaIngredientFactory factory = new NewYorkPizzaIngredientFactory();
    Pizza pizza = null;
    switch (type) {
      case CHEESE:
        pizza = new CheesePizza(factory);
        pizza.setName("New York Style Cheese Pizza");
        break;
      case VEGGIE:
        pizza = new VeggiePizza(factory);
        pizza.setName("New York Style Veggie Pizza");
        break;
      case CLAM:
        pizza = new ClamPizza(factory);
        pizza.setName("New York Style Clam Pizza");
        break;
      case PEPPERONI:
        pizza = new PepperoniPizza(factory);
        pizza.setName("New York Style Pepperoni Pizza");
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + type);
    }
    return pizza;
  }
}
