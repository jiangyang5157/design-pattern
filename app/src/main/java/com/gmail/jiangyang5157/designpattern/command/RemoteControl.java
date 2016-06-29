package com.gmail.jiangyang5157.designpattern.command;

public class RemoteControl {
	public int commandsCount = 0;
	Command[] onCommands = null;
	Command[] offCommands = null;
	
	Command undoCommand = null;
	
	public RemoteControl(int commandsCount){
		this.commandsCount = commandsCount;
		onCommands = new Command[commandsCount];
		offCommands = new Command[commandsCount];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < commandsCount; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int index, Command onCommand, Command offCommand){
		onCommands[index] = onCommand;
		offCommands[index] = offCommand;
	}
	
	public void onButtonWasPressed(int index){
		onCommands[index].execute();
		undoCommand = onCommands[index];
	}
	
	public void offButtonWasPressed(int index){
		offCommands[index].execute();
		undoCommand = offCommands[index];
	}
}
