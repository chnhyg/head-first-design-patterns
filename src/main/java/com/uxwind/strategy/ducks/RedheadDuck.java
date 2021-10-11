package com.uxwind.strategy.ducks;

public class RedheadDuck extends Duck {
  public RedheadDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I'm a real Redhead duck.");
  }
}
