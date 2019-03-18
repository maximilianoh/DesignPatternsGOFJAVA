package gof.structural.bridge.pattern.concreteimplementor;

import gof.structural.bridge.pattern.implementor.Implementor;

public class ConcreteImplementor2 implements Implementor{

	@Override
	public String implementation() {
		return "Implementation from ConcreteImplementor2";
	}

}
