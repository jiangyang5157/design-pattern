package com.gmail.jiangyang5157.designpattern.template;

import android.util.Log;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

	@Override
	public void addCondiments() {
		Log.i("#### CoffeeWithHook ####", "addCondiments()");
	}

	@Override
	public void brew() {
		Log.i("#### CoffeeWithHook ####", "brew()");
	}

}
