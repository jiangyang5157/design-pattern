package com.gmail.jiangyang5157.designpattern.factory;

public abstract class PizzaStory {

	public Pizza orderPizza(String type){
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);
}
