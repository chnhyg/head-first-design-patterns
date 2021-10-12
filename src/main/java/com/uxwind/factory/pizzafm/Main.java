package com.uxwind.factory.pizzafm;

public class Main {
  public static void main(String[] args) {
    PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

    Pizza pizza = newYorkPizzaStore.orderPizza(Pizza.Type.CHEESE);
    System.out.println("Hello Kitty ordered a " + pizza.getName() + ".\n");

    pizza = chicagoPizzaStore.orderPizza(Pizza.Type.CHEESE);
    System.out.println("My Melody ordered a " + pizza.getName() + ".\n");
  }
}
