package gof.behavioral.state.pattern.concretestate;

import gof.behavioral.state.pattern.context.Context;
import gof.behavioral.state.pattern.state.State;

public class ConcreteStateB implements State{

	@Override
	public String handle(Context c) {
		return "StateB";
	}

	@Override
	public State nextState() {
		return new ConcreteStateC();
	}

}
