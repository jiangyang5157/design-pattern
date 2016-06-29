package com.gmail.jiangyang5157.designpattern.command;

public class LightOffCommand implements Command{
	Light light = null;
	
	public LightOffCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
}
