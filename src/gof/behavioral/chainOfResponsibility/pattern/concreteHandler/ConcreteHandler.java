package gof.behavioral.chainOfResponsibility.pattern.concreteHandler;

import gof.behavioral.chainOfResponsibility.pattern.handler.Handler;

public class ConcreteHandler  extends Handler{

	public ConcreteHandler(Handler next) {
		super(next);
	}

	@Override
	protected Boolean handleRequest(String text) {
		if (text==null) return false;
		else return true;
	}

}
