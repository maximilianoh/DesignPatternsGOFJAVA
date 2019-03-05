package gof.behavioral.chainOfResponsibility.pattern.concreteHandler;

import gof.behavioral.chainOfResponsibility.pattern.handler.Handler;

public class ConcreteHandler2 extends Handler{

	public ConcreteHandler2(Handler next) {
		super(next);
	}

	@Override
	protected Boolean handleRequest(String text) {
		return !text.isEmpty();
	}

}
