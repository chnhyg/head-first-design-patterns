package com.uxwind.proxy.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
  String getLocation() throws RemoteException;

  State getState() throws RemoteException;

  int getNumberGumballs() throws RemoteException;
}
