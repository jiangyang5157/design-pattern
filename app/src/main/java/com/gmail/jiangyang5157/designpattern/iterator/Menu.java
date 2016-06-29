package com.gmail.jiangyang5157.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

import android.util.Log;

public class Menu extends MenuComponent {
    private ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    private String name = null;

    public Menu(String name) {
        this.name = name;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public void print() {
        Log.i("#### Menu ####", "name:" + getName());

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
