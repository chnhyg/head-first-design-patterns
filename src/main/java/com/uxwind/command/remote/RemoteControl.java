package com.uxwind.command.remote;

import java.util.Arrays;

public class RemoteControl {
  private final Command[] onCommands;
  private final Command[] offCommands;

  public RemoteControl() {
    onCommands = new Command[7];
    offCommands = new Command[7];

    Command noCommand = new NoCommand();
    Arrays.fill(onCommands, noCommand);
    Arrays.fill(offCommands, noCommand);
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    onCommands[slot].execute();
  }

  public void offButtonWasPushed(int slot) {
    offCommands[slot].execute();
  }

  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("\n").append("------ Remote Control -------").append("\n");
    for (int i = 0; i < onCommands.length; i++) {
      result
          .append("[slot ")
          .append(i)
          .append("] ")
          .append(onCommands[i].getClass().getName())
          .append("    ")
          .append(offCommands[i].getClass().getName())
          .append("\n");
    }
    return result.toString();
  }
}
