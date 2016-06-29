package com.gmail.jiangyang5157.designpattern.adapter;

import android.util.Log;

public class WildTurkey implements Turkey{

	@Override
	public void fly() {
		Log.i("#### WildTurkey ####", "fly()");		
	}

	@Override
	public void gobble() {
		Log.i("#### WildTurkey ####", "gobble()");		
	}

}
