package gof.behavioral.state.pattern.concretestate;

import gof.behavioral.state.pattern.context.Context;
import gof.behavioral.state.pattern.state.State;

public class ConcreteStateC implements State{

	@Override
	public String handle(Context c) {
		return "StateC";
	}

	@Override
	public State nextState() {
		return new ConcreteEndState();
	}

}
