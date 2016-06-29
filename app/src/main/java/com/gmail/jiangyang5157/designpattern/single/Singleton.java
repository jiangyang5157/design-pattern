package com.gmail.jiangyang5157.designpattern.single;

public class Singleton {

	private volatile static Singleton uniqueInstance = null;

	public Singleton() {

	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}

		return uniqueInstance;
	}
}
