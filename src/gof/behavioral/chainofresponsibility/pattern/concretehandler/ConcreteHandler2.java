package gof.behavioral.chainofresponsibility.pattern.concretehandler;

import gof.behavioral.chainofresponsibility.pattern.handler.Handler;

public class ConcreteHandler2 extends Handler{

	public ConcreteHandler2(Handler next) {
		super(next);
	}

	@Override
	protected Boolean handleRequest(String text) {
		return !text.isEmpty();
	}

}
