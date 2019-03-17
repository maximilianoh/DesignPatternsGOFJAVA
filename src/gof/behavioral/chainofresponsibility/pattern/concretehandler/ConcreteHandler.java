package gof.behavioral.chainofresponsibility.pattern.concretehandler;

import gof.behavioral.chainofresponsibility.pattern.handler.Handler;

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
