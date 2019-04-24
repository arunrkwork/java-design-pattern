package com.buildermethod;

public class ComputerBuilder {

	private String brand;
	private int ram;
	private String screensize;
	private String storage;
	
	public ComputerBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public ComputerBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public ComputerBuilder setScreensize(String screensize) {
		this.screensize = screensize;
		return this;
	}
	public ComputerBuilder setStorage(String storage) {
		this.storage = storage;
		return this;
	}
	
	public Computer build() {
		return  new Computer(brand, ram, screensize, storage);
	}
	
}
