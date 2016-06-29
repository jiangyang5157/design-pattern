package com.gmail.jiangyang5157.designpattern.state;

import android.util.Log;

public class WinnerState implements State {

	public GumballMachine gumballMachine = null;
	
	public WinnerState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void dispense() {
		Log.i("#### WinnerState ####", "You're a winner, you get two gumball.");
		
		gumballMachine.releaseBall();
		
		if(gumballMachine.getCount() > 0){
			gumballMachine.releaseBall();
			
			if(gumballMachine.getCount() > 0){
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				Log.i("#### SoldState ####", "Oops, out of gumball.");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		} else {
			Log.i("#### SoldState ####", "Oops, out of gumball. Sorry for that.");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	@Override
	public void ejectQuarter() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void insertQuarter() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void turnCrank() {
		throw new UnsupportedOperationException();
	}

}
