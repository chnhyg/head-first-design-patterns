package com.uxwind.factory.pizzafm;

public class NewYorkStyleClamPizza extends Pizza {
  public NewYorkStyleClamPizza() {
    name = "New York Style Clam Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";

    toppings.add("Grated Reggiano Cheese");
    toppings.add("Fresh Clams from Long Island Sound");
  }
}
