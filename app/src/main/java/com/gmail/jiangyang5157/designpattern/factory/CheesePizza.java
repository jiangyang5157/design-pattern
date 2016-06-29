package com.gmail.jiangyang5157.designpattern.factory;

import android.util.Log;

public class CheesePizza extends Pizza{
	public PizzaIngredientFactory ingredientFactory = null;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;	
	}
	
	@Override
	public void prepare() {
		Log.i("#### CheesePizza ####", "prepare " + name);
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}
}
