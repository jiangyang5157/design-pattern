package com.gmail.jiangyang5157.designpattern.strategy;

import android.util.Log;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		Log.i("#### ModelDuck - display() ####", "I'm a model duck.");
	}
}
