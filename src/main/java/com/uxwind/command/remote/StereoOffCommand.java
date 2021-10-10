package com.uxwind.command.remote;

public class StereoOffCommand implements Command {
  private final Stereo stereo;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.off();
  }
}
