package gof.behavioral.chainOfResponsibility.pattern.concreteHandler;

import gof.behavioral.chainOfResponsibility.pattern.handler.Handler;

public class ConcreteHandler3 extends Handler{

	public ConcreteHandler3(Handler next) {
		super(next);
	}

	@Override
	protected Boolean handleRequest(String text) {
		return text.length()>3;
	}
}
