package com.uxwind.adapter.ducks;

public class Main {
  public static void main(String[] args) {
    MallardDuck duck = new MallardDuck();
    WildTurkey turkey = new WildTurkey();
    Duck turkeyAdapter = new TurkeyAdapter(turkey);

    System.out.println("The Duck says ...");
    testDuck(duck);

    System.out.println();

    System.out.println("The Turkey says ...");
    testTurkey(turkey);

    System.out.println();

    System.out.println("The Turkey Adapter says ...");
    testDuck(turkeyAdapter);
  }

  private static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }

  private static void testTurkey(Turkey turkey) {
    turkey.gobble();
    turkey.fly();
  }
}
