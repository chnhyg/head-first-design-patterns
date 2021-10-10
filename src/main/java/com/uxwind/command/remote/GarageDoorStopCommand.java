package com.uxwind.command.remote;

public class GarageDoorStopCommand implements Command {
  private final GarageDoor garageDoor;

  public GarageDoorStopCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  public void execute() {
    garageDoor.stop();
  }
}
