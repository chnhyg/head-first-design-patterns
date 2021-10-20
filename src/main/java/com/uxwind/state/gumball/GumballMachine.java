package com.uxwind.state.gumball;

public class GumballMachine {
  private final State soldOutState;
  private final State noQuarterState;
  private final State hasQuarterState;
  private final State soldState;
  private final State winnerState;

  private State state;
  private int numberGumballs;

  public GumballMachine(int numberGumballs) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);

    this.state = numberGumballs > 0 ? noQuarterState : soldOutState;
    this.numberGumballs = numberGumballs;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }

  public State getWinnerState() {
    return winnerState;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public int getNumberGumballs() {
    return numberGumballs;
  }

  public void releaseBall() {
    System.out.println("A gumball comes rolling out the slot.");
    if (numberGumballs > 0) {
      numberGumballs--;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  public void refill(int count) {
    numberGumballs += count;
    System.out.println(
        "The gumball machine was just refilled; its new count is: " + numberGumballs + ".");
    state.refill();
  }

  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("Mighty Gumball, Inc.").append("\n");
    result.append("Java-enabled Standing Gumball Model #2004.").append("\n");
    result.append("Inventory: ").append(numberGumballs).append(" gumball");
    if (numberGumballs != 1) {
      result.append("s");
    }
    result.append(".").append("\n");
    result.append("Machine is ").append(state).append("\n");
    return result.toString();
  }
}
