package gof.behavioral.command.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gof.behavioral.command.pattern.command.Command;
import gof.behavioral.command.pattern.concretecommand.ConcreteCommand;
import gof.behavioral.command.pattern.invoker.Invoker;
import gof.behavioral.command.pattern.receiver.ConcreteReceiver;
import gof.behavioral.command.pattern.receiver.ConcreteReceiver2;

public class CommandTest {
	@Test
	public void goodImplementions(){
		Command command=new ConcreteCommand(new ConcreteReceiver());
		Invoker invoker=new Invoker(command);
		assertEquals(invoker.run(10),10);
	}
	
	@Test
	public void errorImplementionsSecondReceiver(){
		Command command=new ConcreteCommand(new ConcreteReceiver2());
		Invoker invoker=new Invoker(command);
		assertEquals(invoker.run(10),-1);
	}
	
	@Test
	public void errorImplementions(){
		Command command=new ConcreteCommand(new ConcreteReceiver());
		Invoker invoker=new Invoker(command);
		assertEquals(invoker.run(-10),-1);
	}
}
