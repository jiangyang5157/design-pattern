package com.gmail.jiangyang5157.designpattern.command;

public class LightOnCommand implements Command{
	Light light = null;
	
	public LightOnCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}
}
