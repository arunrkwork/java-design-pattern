package com.factorymethod;

public class FattoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RoomFactory roomFactory = new RoomFactory();
		Room room = roomFactory.getInstance("bed");
		room.type();
		
	}

}
