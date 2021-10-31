package com.uxwind.proxy.gumball;

import java.util.Random;

public class HasQuarterState implements State {
  private final transient GumballMachine gumballMachine;
  private final Random randomWinner;

  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
    this.randomWinner = new Random(System.currentTimeMillis());
  }

  public void insertQuarter() {
    System.out.println("You can't insert another quarter.");
  }

  public void ejectQuarter() {
    System.out.println("Quarter returned.");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

  public void turnCrank() {
    System.out.println("You turned.");
    int winner = randomWinner.nextInt(10);
    if ((winner == 0) && (gumballMachine.getNumberGumballs() > 1)) {
      gumballMachine.setState(gumballMachine.getWinnerState());
    } else {
      gumballMachine.setState(gumballMachine.getSoldState());
    }
  }

  public void dispense() {
    System.out.println("No gumball dispensed.");
  }

  public void refill() {
    // Nothing to do.
  }

  public String toString() {
    return "Waiting for turn of crank.";
  }
}
