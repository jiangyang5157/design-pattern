package com.gmail.jiangyang5157.designpattern.strategy;

import android.util.Log;

public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		Log.i("#### FlyWithWings - fly()", "I'm flying.");
	}
}
