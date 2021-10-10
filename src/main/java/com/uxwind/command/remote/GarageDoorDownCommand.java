package com.uxwind.command.remote;

public class GarageDoorDownCommand implements Command {
  private final GarageDoor garageDoor;

  public GarageDoorDownCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  public void execute() {
    garageDoor.down();
  }
}
