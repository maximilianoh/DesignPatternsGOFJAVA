package gof.structural.bridge.pattern.refinedabstraction;

import gof.structural.bridge.pattern.abstraction.Abstraction;
import gof.structural.bridge.pattern.implementor.Implementor;

public class RefinedAbstraction extends Abstraction{
	
	public RefinedAbstraction(Implementor i) {
		this.impl=i;
	}

	@Override
	public String function() {
		return this.impl.implementation();
	}

}
