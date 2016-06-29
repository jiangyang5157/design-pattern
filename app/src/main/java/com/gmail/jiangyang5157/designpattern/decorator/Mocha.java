package com.gmail.jiangyang5157.designpattern.decorator;

public class Mocha extends CondimentDecorator{
	private Beverage beverage = null;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		int size = beverage.getSize();
		
		switch (size){
		case Beverage.TALL:
			cost += 0.10;
			break;
		case Beverage.GRANDE:
			cost += 0.15;
			break;
		case Beverage.VENTI:
			cost += 0.17;
			break;
		}
		
		return cost;
	}
	
}
