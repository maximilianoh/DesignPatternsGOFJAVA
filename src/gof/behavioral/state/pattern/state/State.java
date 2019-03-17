package gof.behavioral.state.pattern.state;

import gof.behavioral.state.pattern.context.Context;

public interface State {
	public String handle(Context c);
	public State nextState();
}
