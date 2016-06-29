package com.gmail.jiangyang5157.designpattern.state;

import android.util.Log;

public class SoldOutState implements State {

	public GumballMachine gumballMachine = null;
	
	public SoldOutState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void dispense() {
		Log.i("#### SoldOutState ####", "Is sold out, can't dispense.");
	}

	@Override
	public void ejectQuarter() {
		Log.i("#### SoldOutState ####", "Is sold out, can't eject quarter.");
	}

	@Override
	public void insertQuarter() {
		Log.i("#### SoldOutState ####", "Is sold out, can't insert quarter.");
	}

	@Override
	public void turnCrank() {
		Log.i("#### SoldOutState ####", "Is sold out, can't turn crank.");
	}
}
