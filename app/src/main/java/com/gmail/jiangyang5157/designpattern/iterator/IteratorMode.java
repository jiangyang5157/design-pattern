package com.gmail.jiangyang5157.designpattern.iterator;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.gmail.jiangyang5157.designpattern.R;

public class IteratorMode extends Activity {

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
		MenuComponent allMenu = new Menu("All Menu");
		
		MenuComponent dinerMenu = new Menu("DinerMenu");
		MenuComponent cafeMenu = new Menu("CafeMenu");
		allMenu.add(dinerMenu);

		dinerMenu.add(new MenuItem("Hotdog", 3.05, true));
		dinerMenu.add(new MenuItem("Soup of the day", 3.29, true));

		cafeMenu.add(new MenuItem("Maxwell", 12.00, true));
		
		dinerMenu.add(cafeMenu);
		
		Waitress waitress = new Waitress(allMenu);
		waitress.printMenu();
	}
}