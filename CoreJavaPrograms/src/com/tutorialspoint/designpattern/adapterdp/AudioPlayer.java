package com.tutorialspoint.designpattern.adapterdp;

public class AudioPlayer implements MediaPlayer {

	public MediaAdapter mediaAdapter;
	public MediaPlayer mediaPlayer;
	
	@Override
	public void play(String audioType, String fileName) {
		System.out.println("");
		if(audioType.equalsIgnoreCase("MP3")){
			System.out.println("Playing MP3 in AudioPlayer "+fileName);
		}else if(audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("MP4")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		
		else{
			System.out.println("Invalid Media format "+audioType);
		}
	}

}
