package com.gmail.jiangyang5157.designpattern.command;

import android.app.Activity;
import android.os.Bundle;

import com.gmail.jiangyang5157.designpattern.R;

public class CommandMode extends Activity {

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
		RemoteControl remoteCotrol = new RemoteControl(2);
		
		Light light1 = new Light("Living Room 1");
		LightOnCommand lightOnCommand1 = new LightOnCommand(light1);
		LightOffCommand lightOffCommand1 = new LightOffCommand(light1);
		remoteCotrol.setCommand(0, lightOnCommand1, lightOffCommand1);
		
		Light light2 = new Light("Living Room 2");
		LightOnCommand lightOnCommand2 = new LightOnCommand(light2);
		LightOffCommand lightOffCommand2 = new LightOffCommand(light2);
		remoteCotrol.setCommand(1, lightOnCommand2, lightOffCommand2);
		
		remoteCotrol.onButtonWasPressed(0);
		remoteCotrol.offButtonWasPressed(1);
	}
}