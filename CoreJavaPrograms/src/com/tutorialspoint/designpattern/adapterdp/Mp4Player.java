package com.tutorialspoint.designpattern.adapterdp;

public class Mp4Player implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// DO NOTHING
		System.out.println("Call VLC PLAYER ");
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing MP4 "+fileName);
	}

}
