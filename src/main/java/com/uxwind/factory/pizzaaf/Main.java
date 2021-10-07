package com.uxwind.factory.pizzaaf;

public class Main {
  public static void main(String[] args) {
    PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

    Pizza pizza = newYorkPizzaStore.orderPizza(Pizza.Type.CHEESE);
    System.out.println("Kitty ordered a " + pizza.getName() + ".\n");

    pizza = chicagoPizzaStore.orderPizza(Pizza.Type.CHEESE);
    System.out.println("Melody ordered a " + pizza.getName() + ".\n");
  }
}
