package com.uxwind.factory.pizzafm;

public class NewYorkStylePepperoniPizza extends Pizza {
  public NewYorkStylePepperoniPizza() {
    name = "New York Style Pepperoni Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";

    toppings.add("Grated Reggiano Cheese");
    toppings.add("Sliced Pepperoni");
    toppings.add("Garlic");
    toppings.add("Onion");
    toppings.add("Mushrooms");
    toppings.add("Red Pepper");
  }
}
