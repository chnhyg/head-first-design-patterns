package com.uxwind.command.remote;

public class StereoOnWithDVDCommand implements Command {
  private final Stereo stereo;

  public StereoOnWithDVDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.on();
    stereo.setDVD();
    stereo.setVolume(11);
  }
}
