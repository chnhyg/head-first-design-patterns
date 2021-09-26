package com.uxwind.decorator.starbuzz;

public class Main {
  public static void main(String[] args) {
    Beverage espresso = new Espresso();
    System.out.println(espresso.getDescription() + " $" + String.format("%.2f", espresso.cost()));

    Beverage darkRoast = new DarkRoast();
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Whip(darkRoast);
    System.out.println(darkRoast.getDescription() + " $" + String.format("%.2f", darkRoast.cost()));

    Beverage houseBlend = new HouseBlend();
    houseBlend.setSize(Beverage.Size.VENTI);
    houseBlend = new Soy(houseBlend);
    houseBlend = new Mocha(houseBlend);
    houseBlend = new Whip(houseBlend);
    System.out.println(houseBlend.getDescription() + " $" + String.format("%.2f", houseBlend.cost()));
  }
}
