package gof.behavioral.strategy.pattern.concretestrategy;

import gof.behavioral.strategy.pattern.strategy.Strategy;

public class ConcreteStrategy1  implements Strategy{

	@Override
	public String algorithmInterface() {
		return "Strategy1";
	}

}
