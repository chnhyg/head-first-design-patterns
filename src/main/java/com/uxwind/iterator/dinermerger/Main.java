package com.uxwind.iterator.dinermerger;

public class Main {
  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    CafeMenu cafeMenu = new CafeMenu();
    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

    waitress.printMenu();
    System.out.println();

    waitress.printVegetarianMenu();
    System.out.println();

    System.out.println("Customer asks, is the Hotdog vegetarian?");
    System.out.print("Waitress says: ");
    System.out.println(waitress.isVegetarian("Hotdog") ? "Yes." : "No.");
    System.out.println();

    System.out.println("Customer asks, are the Waffles vegetarian?");
    System.out.print("Waitress says: ");
    System.out.println(waitress.isVegetarian("Waffles") ? "Yes." : "No.");
    System.out.println();
  }
}
