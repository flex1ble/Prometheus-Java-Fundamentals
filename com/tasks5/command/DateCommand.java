package com.tasks5.command;

public class DateCommand implements Command {
	private long dateValue;

	@Override
	public void execute() {
		System.out.println(dateValue);

	}

	DateCommand(String dateString) {
		dateValue = System.currentTimeMillis();
	}

}
