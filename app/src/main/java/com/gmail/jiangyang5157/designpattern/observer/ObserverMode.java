package com.gmail.jiangyang5157.designpattern.observer;

import android.app.Activity;
import android.os.Bundle;

import com.gmail.jiangyang5157.designpattern.R;

public class ObserverMode extends Activity {

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
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(
				weatherData);

		weatherData.setMeasurements(2006f, 2.6f);
	}
}