package com.gmail.jiangyang5157.designpattern.strategy;

import android.util.Log;

public abstract class Duck {

	public FlyBehavior flyBehavior = null;

	public Duck() {

	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void swim() {
		Log.i("#### Duck - swim() ####", "All ducks float, event decoys.");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
}
