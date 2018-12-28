package com.tutorialspoint.designpattern.bridgedp;

public class TestTheRemote {

	public static void main(String[] args) {
		RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));
		RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));
		System.out.println("TV1 functions WHICH HAS MUTE");
		theTV.buttonFivePressed();
		theTV.buttonSixPressed();
		theTV.buttonNinePressed();
		System.out.println("");
		System.out.println("TV2 functions WHICH HAS PAUSE");
		theTV2.buttonFivePressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonNinePressed();
		theTV2.deviceFeedback();
		
	}

}
