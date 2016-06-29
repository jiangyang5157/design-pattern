package com.gmail.jiangyang5157.designpattern.state;

import android.util.Log;

public class NoQuarterState implements State{
	
	public GumballMachine gumballMachine = null;
	
	public NoQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void dispense() {
		Log.i("#### NoQuarterState ####", "You need to pay first.");
	}

	@Override
	public void ejectQuarter() {
		Log.i("#### NoQuarterState ####", "You haven't inserted a quarter.");
	}

	@Override
	public void insertQuarter() {
		Log.i("#### NoQuarterState ####", "You inserted a quarter.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void turnCrank() {
		Log.i("#### NoQuarterState ####", "You turned, but there's no quarter.");
	}

}
