package com.gmail.jiangyang5157.designpattern.adapter;

import android.util.Log;

public class MallardDuck implements Duck{

	@Override
	public void fly() {
		Log.i("#### MallardDuck ####", "fly()");
	}

	@Override
	public void quack() {
		Log.i("#### MallardDuck ####", "quack()");		
	}

}
