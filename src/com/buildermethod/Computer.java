package com.buildermethod;

public class Computer {
	
	private String brand;
	private int ram;
	private String screensize;
	private String storage;
	
	public Computer(String brand, int ram, String screensize, String storage) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.screensize = screensize;
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", ram=" + ram + ", screensize=" + screensize + ", storage=" + storage
				+ "]";
	}
	
	
	

}
