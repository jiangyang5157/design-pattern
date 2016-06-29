package com.gmail.jiangyang5157.designpattern.factory;

public interface PizzaIngredientFactory {
	String createSauce();
	String createCheese();
	String[] createVeggies();
}
