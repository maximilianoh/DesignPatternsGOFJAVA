package gof.behavioral.state.pattern.context;

import gof.behavioral.state.pattern.concretestate.ConcreteStateA;
import gof.behavioral.state.pattern.state.State;

public class Context {
	private State state;
	
	public Context() {
		this.state = new ConcreteStateA();
	}

	public String request() {
		String text= state.handle(this);
		state = state.nextState();
		return text;
	}
}
