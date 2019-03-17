package gof.behavioral.command.pattern.concretecommand;

import gof.behavioral.command.pattern.command.Command;
import gof.behavioral.command.pattern.receiver.Receiver;

public class ConcreteCommand implements Command{
	private Receiver receiver;
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	@Override
	public int execute(int number) {
		try {
			if (number<0) throw new UnsupportedOperationException("negative");
			receiver.doSomething2();
			receiver.doSomething();			
			return number;
		}
		catch (Exception e) {return -1;}
	}

}
