package com.gmail.jiangyang5157.designpattern.template;

import android.util.Log;

public class TeaWithHook extends CaffeineBeverageWithHook{

	@Override
	public void addCondiments() {
		Log.i("#### TeaWithHook ####", "addCondiments()");
	}

	@Override
	public void brew() {
		Log.i("#### TeaWithHook ####", "brew()");
	}

}
