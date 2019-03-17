package gof.behavioral.chainofresponsibility.pattern.concretehandler;

import gof.behavioral.chainofresponsibility.pattern.handler.Handler;

public class ConcreteHandler3 extends Handler{

	public ConcreteHandler3(Handler next) {
		super(next);
	}

	@Override
	protected Boolean handleRequest(String text) {
		return text.length()>3;
	}
}
