package com.gmail.jiangyang5157.designpattern.state;

import android.util.Log;

public class GumballMachine implements State{
	private State soldOutState = null;
	private State noQuarterState = null;
	private State hasQuarterState = null;
	private State soldState = null;
	
	private State winnerState = null;
	
	private State state = soldOutState;

	private int count = 0;

	public GumballMachine(int count){
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		
		winnerState = new WinnerState(this);
		
		this.count = count;
		if (count > 0){
			state = noQuarterState;
		}
	}
	
	public void releaseBall(){
		Log.i("#### GumballMachine ####", "releaseBall()");
		
		if (count != 0){
			count--;
		}
	}

	@Override
	public void dispense() {
		state.dispense();		
	}

	@Override
	public void ejectQuarter() {
		state.ejectQuarter();		
	}

	@Override
	public void insertQuarter() {
		state.insertQuarter();
	}

	@Override
	public void turnCrank() {
		state.turnCrank();
		dispense();
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public int getCount() {
		return count;
	}
	public State getWinnerState() {
		return winnerState;
	}
}
