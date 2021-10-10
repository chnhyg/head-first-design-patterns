package com.uxwind.command.remote;

public class StereoOnWithRadioCommand implements Command {
  private final Stereo stereo;

  public StereoOnWithRadioCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.on();
    stereo.setRadio();
    stereo.setVolume(11);
  }
}
