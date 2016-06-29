package com.gmail.jiangyang5157.designpattern.template;

import android.util.Log;

public abstract class CaffeineBeverageWithHook {

	public void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments1() && customerWantsCondiments2()){
			addCondiments();
		}
	}
	
	public abstract void brew();
	
	public abstract void addCondiments();
	
	public void boilWater(){
		Log.i("#### CaffeineBeverageWithHook ####", "Boiling water.");
	}
	
	public void pourInCup(){
		Log.i("#### CaffeineBeverageWithHook ####", "Pouring into cup.");
	}

	public boolean customerWantsCondiments1(){
		return true;
	}

	public final boolean customerWantsCondiments2(){
		return true;
	}
}
