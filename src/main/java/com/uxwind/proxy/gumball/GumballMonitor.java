package com.uxwind.proxy.gumball;

import java.rmi.RemoteException;

public class GumballMonitor {
  private final GumballMachineRemote gumballMachine;

  public GumballMonitor(GumballMachineRemote gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void report() {
    try {
      System.out.println("Gumball Machine: " + gumballMachine.getLocation() + ".");
      System.out.println("Current inventory: " + gumballMachine.getNumberGumballs() + " gumballs.");
      System.out.println("Current state: " + gumballMachine.getState());
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }
}
