package com.tutorialspoint.designpattern.adapterdp;

public class MediaAdapter implements MediaPlayer {
	public AdvanceMediaPlayer advanceMediaPlayer = null;
	
	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("MP4")){
			advanceMediaPlayer = new Mp4Player();
		}else if(audioType.equalsIgnoreCase("VLC")){
			advanceMediaPlayer = new VlcPlayer();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("MP4")){
			advanceMediaPlayer.playMp4(fileName);
		}else if(audioType.equalsIgnoreCase("VLC")){
			advanceMediaPlayer.playVlc(fileName);
		}
	}

}
