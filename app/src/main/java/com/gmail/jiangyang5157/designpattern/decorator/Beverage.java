package com.gmail.jiangyang5157.designpattern.decorator;

public abstract class Beverage {
	public String description = "Unknown Beverage";
	public static final int TALL = 1;
	public static final int GRANDE = 2;
	public static final int VENTI = 3;
	public int size = 0;

	public String getDescription() {
		return description;
	}

	public int getSize() {
		return size;
	}
	
	public abstract double cost();
}
