package com.gmail.jiangyang5157.designpattern.observer;

import android.util.Log;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature = 0;
	private float humidity = 0;

	private Subject weatherData = null;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;

		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity) {
		this.temperature = temperature;
		this.humidity = humidity;

		display();
	}

	@Override
	public void display() {
		Log.i("#### CurrentConditionsDisplay - display() ####", "Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
	}
}
