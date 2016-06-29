package com.gmail.jiangyang5157.designpattern.strategy;

import android.util.Log;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		Log.i("#### FlyNoWay - fly()", "I can't fly.");
	}
}
