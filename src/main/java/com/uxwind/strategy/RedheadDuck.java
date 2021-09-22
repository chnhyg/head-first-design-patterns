package com.uxwind.strategy;

public class RedheadDuck extends Duck {
  public RedheadDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I'm a real Redhead duck.");
  }
}
