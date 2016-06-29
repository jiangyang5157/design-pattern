package com.gmail.jiangyang5157.designpattern.state;

import android.util.Log;

public class SoldState implements State {

	public GumballMachine gumballMachine = null;
	
	public SoldState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		
		if(gumballMachine.getCount() > 0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			Log.i("#### SoldState ####", "Oops, out of gumball.");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	@Override
	public void ejectQuarter() {
		Log.i("#### SoldState ####", "Sorry, you already turned the crank.");
	}

	@Override
	public void insertQuarter() {
		Log.i("#### SoldState ####", "Please wait, we're already giving you a gumball.");
	}

	@Override
	public void turnCrank() {
		Log.i("#### SoldState ####", "Turning twice doesn't get you another gumball.");
	}
}
