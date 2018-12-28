package com.tutorialspoint.designpattern.adapterdp;

public class VlcPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing in VLCPlayer of file "+fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// DO NOTHING
		System.out.println("Mp4Plaayer class has to be called");
	}

}
