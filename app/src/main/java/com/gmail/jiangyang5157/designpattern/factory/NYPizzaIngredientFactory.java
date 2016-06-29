package com.gmail.jiangyang5157.designpattern.factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public String createCheese() {
		return "NY createCheese";
	}

	@Override
	public String createSauce() {
		return "NY createSauce";
	}

	@Override
	public String[] createVeggies() {
		return new String[]{"NY Veggies1", "NY Veggies2"};
	}
}
