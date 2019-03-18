package gof.structural.flyweight.pattern.flyweightfactory;

import java.util.HashMap;
import java.util.Map;

import gof.structural.flyweight.pattern.concreteflyweight.ConcreteFlyweight;
import gof.structural.flyweight.pattern.flyweight.Flyweight;

public class FlyweightFactory {
	private Map<String,Flyweight> flyweights;

	public FlyweightFactory() {
		this.flyweights = new HashMap<>();
	}
	public Flyweight getFlyweights(String name) {
		Flyweight f=flyweights.get(name);
		if (f==null) {
			f=new ConcreteFlyweight(name);
			flyweights.put(name, f);
		}
		return f;
	}
	
}
