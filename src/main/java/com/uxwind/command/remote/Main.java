package com.uxwind.command.remote;

public class Main {
  public static void main(String[] args) {
    Light light = new Light();
    LightOnCommand lightOnCommand = new LightOnCommand(light);
    LightOffCommand lightOffCommand = new LightOffCommand(light);

    GarageDoor garageDoor = new GarageDoor();
    GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
    GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

    Stereo stereo = new Stereo();
    StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
    StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

    Command[] partyOnCommands = {lightOnCommand, stereoOnWithCDCommand};
    Command[] partyOffCommands = {lightOffCommand, stereoOffCommand};
    MacroCommand partyOnCommand = new MacroCommand(partyOnCommands);
    MacroCommand partyOffCommand = new MacroCommand(partyOffCommands);

    RemoteControl remoteControl = new RemoteControl();
    remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
    remoteControl.setCommand(1, garageDoorUpCommand, garageDoorDownCommand);
    remoteControl.setCommand(2, partyOnCommand, partyOffCommand);

    System.out.println(remoteControl);

    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(1);
    remoteControl.offButtonWasPushed(1);
    remoteControl.onButtonWasPushed(2);
    remoteControl.offButtonWasPushed(2);
    remoteControl.onButtonWasPushed(3);
    remoteControl.offButtonWasPushed(3);
  }
}
