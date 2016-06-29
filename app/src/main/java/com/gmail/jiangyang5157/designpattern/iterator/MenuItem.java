package com.gmail.jiangyang5157.designpattern.iterator;

import android.util.Log;

public class MenuItem extends MenuComponent{
	private String name = null;
	private double price = 0;
	private boolean isVegetarian = false;

	public MenuItem(String name, double price, boolean isVegetarian){
		this.name = name;
		this.price = price;
		this.isVegetarian = isVegetarian;
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public boolean isVegetarian(){
		return isVegetarian;
	}
	
	public void print(){
		Log.i("#### MenuItem ####", "name:"
				+ getName() + " price:" + getPrice());
	}
}
