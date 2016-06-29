package com.gmail.jiangyang5157.designpattern.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{

	private ArrayList<Observer> observers = null;
	
	private float temperature = 0;
	private float humidity = 0;
	
	public WeatherData(){
		observers = new ArrayList<>();
	}
	
	public void setMeasurements(float temperature, float humidity){
		this.temperature = temperature;
		this.humidity = humidity;
		
		MeasurementsChanged();
	}
	
	public void MeasurementsChanged(){
		notifyObserver();
	}
	
	@Override
	public void notifyObserver() {
		int size = observers.size();
		
		for(int i = 0; i < size; i++){
			Observer observer = observers.get(i);
			observer.update(temperature, humidity);
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		
		if (i >= 0){
			observers.remove(i);
		}
	}
}
