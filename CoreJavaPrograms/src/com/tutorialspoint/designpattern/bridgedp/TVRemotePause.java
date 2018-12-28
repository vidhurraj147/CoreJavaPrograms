package com.tutorialspoint.designpattern.bridgedp;

public class TVRemotePause extends RemoteButton{

	
	public TVRemotePause(EntertainmentDevice newDevice) {
		super(newDevice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("TV WAS PAUSED");
	}

}
