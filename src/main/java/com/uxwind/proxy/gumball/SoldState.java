package com.uxwind.proxy.gumball;

public class SoldState implements State {
  private final transient GumballMachine gumballMachine;

  public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertQuarter() {
    System.out.println("Please wait, we're already giving you a gumball.");
  }

  public void ejectQuarter() {
    System.out.println("Sorry, you already turned the crank.");
  }

  public void turnCrank() {
    System.out.println("Turning twice doesn't get you another gumball.");
  }

  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getNumberGumballs() == 0) {
      System.out.println("Oops, out of gumballs.");
      gumballMachine.setState(gumballMachine.getSoldOutState());
    } else {
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
  }

  public void refill() {
    // Nothing to do.
  }

  public String toString() {
    return "Dispensing a gumball.";
  }
}
