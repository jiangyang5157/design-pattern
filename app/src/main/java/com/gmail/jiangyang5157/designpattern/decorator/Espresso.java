package com.gmail.jiangyang5157.designpattern.decorator;

public class Espresso extends Beverage {

	public Espresso(int size) {
		this.description = "Espresso";
		this.size = size;
	}

	@Override
	public double cost() {
		double cost = 0;
		int size = this.getSize();
		
		switch (size){
		case Beverage.TALL:
			cost += 5.17;
			break;
		case Beverage.GRANDE:
			cost += 5.18;
			break;
		case Beverage.VENTI:
			cost += 5.19;
			break;
		}
		
		return cost;
	}
}
