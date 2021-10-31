package com.uxwind.proxy.gumball;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Main {
  public static void main(String[] args) {
    startGumballMachine();
    startGumballMonitor();
  }

  public static void startGumballMachine() {
    String location = "localhost";
    int numberGumballs = 2;

    try {
      LocateRegistry.createRegistry(1099);
      GumballMachine gumballMachine = new GumballMachine(location, numberGumballs);
      Naming.rebind("//" + location + "/gumball-machine", gumballMachine);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void startGumballMonitor() {
    String location = "rmi://localhost/gumball-machine";

    try {
      GumballMachineRemote gumballMachine = (GumballMachineRemote) Naming.lookup(location);
      GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
      gumballMonitor.report();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
