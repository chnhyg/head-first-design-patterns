package com.uxwind.proxy.gumball;

public class WinnerState implements State {
  private final transient GumballMachine gumballMachine;

  public WinnerState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertQuarter() {
    System.out.println("Please wait, we're already giving you a gumball.");
  }

  public void ejectQuarter() {
    System.out.println("Please wait, we're already giving you a gumball.");
  }

  public void turnCrank() {
    System.out.println("Turning again doesn't get you another gumball.");
  }

  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getNumberGumballs() == 0) {
      System.out.println("Oops, out of gumballs.");
      gumballMachine.setState(gumballMachine.getSoldOutState());
    } else {
      gumballMachine.releaseBall();
      System.out.println("You're a winner! You got two gumballs for your quarter.");
      if (gumballMachine.getNumberGumballs() == 0) {
        System.out.println("Oops, out of gumballs.");
        gumballMachine.setState(gumballMachine.getSoldOutState());
      } else {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
      }
    }
  }

  public void refill() {
    // Nothing to do.
  }

  public String toString() {
    return "Dispensing two gumballs for your quarter, because you're a winner.";
  }
}
