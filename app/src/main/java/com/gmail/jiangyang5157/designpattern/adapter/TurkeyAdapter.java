package com.gmail.jiangyang5157.designpattern.adapter;

public class TurkeyAdapter implements Duck{

	public Turkey turkey = null;
	
	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
	}
	
	@Override
	public void fly() {
		turkey.fly();		
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

}
