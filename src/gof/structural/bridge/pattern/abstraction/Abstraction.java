package gof.structural.bridge.pattern.abstraction;

import gof.structural.bridge.pattern.implementor.Implementor;

public abstract class Abstraction {
	protected Implementor impl;

	public Implementor getImpl() {
		return impl;
	}
	
	public void setImpl(Implementor impl) {
		this.impl = impl;
	}

	public abstract String function();
	
}
