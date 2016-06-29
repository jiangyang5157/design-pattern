package com.gmail.jiangyang5157.designpattern.iterator;

public class Waitress {
	private MenuComponent menuComponent = null;

	public Waitress(MenuComponent menuComponent) {
		this.menuComponent = menuComponent;
	}

	public void printMenu() {
		menuComponent.print();
	}
}
