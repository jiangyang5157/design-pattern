package com.gmail.jiangyang5157.designpattern.command;

import android.util.Log;

public class Light {
	
	public String name = null;
	
	public Light(String name){
		this.name = name;
	}
	
	public void on(){
		Log.i("#### Light ####", name + " on()");
	}
	
	public void off(){
		Log.i("#### Light ####", name + " off()");
	}
}
