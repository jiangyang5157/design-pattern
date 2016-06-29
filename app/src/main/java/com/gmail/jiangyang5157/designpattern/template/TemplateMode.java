package com.gmail.jiangyang5157.designpattern.template;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.gmail.jiangyang5157.designpattern.R;

public class TemplateMode extends Activity {

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
		TeaWithHook teaWithHook = new TeaWithHook();
		CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
		
		Log.i("#### TemplateMode ####", "Making tea....");
		teaWithHook.prepareRecipe();
		Log.i("#### TemplateMode ####", "Making coffee....");
		coffeeWithHook.prepareRecipe();
	}
}