package com.uxwind.factory.pizzafm;

public class NewYorkStyleVeggiePizza extends Pizza {
  public NewYorkStyleVeggiePizza() {
    name = "New York Style Veggie Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";

    toppings.add("Grated Reggiano Cheese");
    toppings.add("Garlic");
    toppings.add("Onion");
    toppings.add("Mushrooms");
    toppings.add("Red Pepper");
  }
}
