package com.gmail.jiangyang5157.designpattern.observer;

public interface Subject {
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObserver();
}
