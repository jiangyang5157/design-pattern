package com.gmail.jiangyang5157.designpattern.factory;

import android.util.Log;

public abstract class Pizza {
	String name = null;
	
	String sauce = null;
	String cheese = null;
	String[] veggies = null;
	
	public abstract void prepare();
	
	public void bake(){
		Log.i("#### Pizza ####", "bake()");
	}
	
	public void cut(){
		Log.i("#### Pizza ####", "cut()");
	}
	
	public void box(){
		Log.i("#### Pizza ####", "box()");
	}
}
