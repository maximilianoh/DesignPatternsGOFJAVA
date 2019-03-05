package gof.behavioral.command.pattern.receiver;

public class ConcreteReceiver implements Receiver{

	@Override
	public void doSomething() {
		System.out.println("doSomething from ConcreteReceiver");
	}

	@Override
	public void doSomething2() {
		System.out.println("doSomething2 from ConcreteReceiver");
	}

}
