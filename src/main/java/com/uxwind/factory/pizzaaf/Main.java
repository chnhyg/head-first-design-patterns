package com.uxwind.factory.pizzaaf;

public class Main {
  public static void main(String[] args) {
    PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

    Pizza newYorkPizza = newYorkPizzaStore.orderPizza(Pizza.Type.CHEESE);
    System.out.println("Hello Kitty ordered a " + newYorkPizza.getName() + ".");
    System.out.println();

    Pizza chicagoPizza = chicagoPizzaStore.orderPizza(Pizza.Type.CHEESE);
    System.out.println("My Melody ordered a " + chicagoPizza.getName() + ".");
    System.out.println();
  }
}
