package com.tasks5.command;

public class Application {
	private static Command command;
	
	public static void main(String[] args) {
		if ((args == null) || (args.length <= 0)) {
			System.out.println("Error");
			return;
		}
		switch (args[0]) {
		case "help":
			if (args.length != 1) {
				System.out.println("Error");
				return;
			}
			command = new HelpCommand();
			break;
		case "echo":
			if (args.length != 2) {
				System.out.println("Error");
				return;
			}
			command = new EchoCommand(args[1]);
			break;
		case "date":
			if (args.length != 2 || args[1] !="now") {
				System.out.println("Error");
				return;
			}
			command = new DateCommand(args[1]);
			break;
		case "exit":
			if (args.length != 1) {
				System.out.println("Error");
				return;
			}
			command = new ExitCommand();
			break;
		default:
			System.out.println("Error");
			return;
		}
		
		command.execute();
	}

}
