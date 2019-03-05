package gof.behavioral.command.pattern.invoker;

import gof.behavioral.command.pattern.command.Command;

public class Invoker {
	private Command command;    
	public Invoker(Command command) {        
		this.command = command;    
	}    
	public int run(int value) {        
		return command.execute(value);    
	}
}
