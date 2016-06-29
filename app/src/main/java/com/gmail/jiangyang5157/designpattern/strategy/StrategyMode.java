package com.gmail.jiangyang5157.designpattern.strategy;

import android.app.Activity;
import android.os.Bundle;

import com.gmail.jiangyang5157.designpattern.R;

public class StrategyMode extends Activity {

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
		Duck model = new ModelDuck();
		model.display();
		model.swim();
		model.performFly();

		model.setFlyBehavior(new FlyWithWings());
		model.performFly();
	}
}