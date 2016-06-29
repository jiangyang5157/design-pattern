package com.gmail.jiangyang5157.designpattern.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend(int size) {
		this.description = "House Blend Coffee";
		this.size = size;
	}

	@Override
	public double cost() {
		double cost = 0;
		int size = this.getSize();
		
		switch (size){
		case Beverage.TALL:
			cost += 22.0;
			break;
		case Beverage.GRANDE:
			cost += 22.1;
			break;
		case Beverage.VENTI:
			cost += 22.2;
			break;
		}
		
		return cost;
	}
}
