package com.factorymethod;

public class RoomFactory {

	public Room getInstance(String type) {
		if(type.equals("bed")) return new BedRoom1();
		else if(type.equals("kit")) return new Kitchen();
		else return new Hall(); 
	}
	
}
