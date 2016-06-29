package com.gmail.jiangyang5157.designpattern.adapter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.gmail.jiangyang5157.designpattern.R;

public class AdapterMode extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info);

		setupViews();
		initialization();
	}

	private void setupViews() {

	}

	private void initialization() {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		duck.quack();
		duck.fly();

		turkey.gobble();
		turkey.fly();

		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}
}