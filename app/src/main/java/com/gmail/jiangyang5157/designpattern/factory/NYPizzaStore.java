package com.gmail.jiangyang5157.designpattern.factory;

public class NYPizzaStore extends PizzaStory{

	public Pizza createPizza(String type){
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if (type.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.name = "New York Style Cheese Pizza";
		}
		
		return pizza;
	}
}
