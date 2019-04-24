package com.buildermethod;

public class BuilderMain {

	public static void main(String[] args) {
		
		Computer computer = new ComputerBuilder()
								.setBrand("Dell")
								.setRam(8)
								.build();
		
		System.out.print(computer);
		
	}

}
