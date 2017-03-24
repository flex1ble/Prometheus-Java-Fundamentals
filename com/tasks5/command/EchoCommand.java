package com.tasks5.command;

public class EchoCommand implements Command {
	private String text;
	
	EchoCommand(String text){
		this.text = text;
	}
	
	@Override
	public void execute() {
		System.out.println(text);
	}
	

}
