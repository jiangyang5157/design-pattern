package com.gmail.jiangyang5157.designpattern.state;

import android.util.Log;

public class HasQuarterState implements State {

	public GumballMachine gumballMachine = null;
	
	public HasQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void dispense() {
		Log.i("#### HasQuarterState ####", "No gumball dispensed.");
	}

	@Override
	public void ejectQuarter() {
		Log.i("#### HasQuarterState ####", "Quarter returned.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void insertQuarter() {
		Log.i("#### HasQuarterState ####", "You can't insert another quarter.");
	}

	@Override
	public void turnCrank() {
		Log.i("#### HasQuarterState ####", "You turned....");
		
		int random = (int)(Math.random()*2);
		Log.i("#### HasQuarterState ####", "random = " + random);
		
		if (random == 1){
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else{
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}
}
