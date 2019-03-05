package gof.behavioral.command.pattern.receiver;

public class ConcreteReceiver2 implements Receiver{

	@Override
	public void doSomething() {
		System.out.println("doSomething from ConcreteReceiver2");
	}

	@Override
	public void doSomething2() {
		throw new UnsupportedOperationException("Error");
	}

}
