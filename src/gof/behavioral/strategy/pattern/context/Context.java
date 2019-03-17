package gof.behavioral.strategy.pattern.context;

import java.util.HashMap;
import java.util.Map;

import gof.behavioral.strategy.pattern.concretestrategy.ConcreteStrategy0;
import gof.behavioral.strategy.pattern.concretestrategy.ConcreteStrategy1;
import gof.behavioral.strategy.pattern.strategy.Strategy;

public class Context {
	private Strategy strategy;
	private Map<Integer,Strategy> strategies=new HashMap<Integer,Strategy>();
	
	public Context() {
		strategies.put(0, new ConcreteStrategy0());
		strategies.put(1, new ConcreteStrategy1());
	}
	public void setStrategy(Integer n) {
		strategy=strategies.get(n);
	}
	public String contextInterface() {
		return strategy.algorithmInterface();
	}
	
}
