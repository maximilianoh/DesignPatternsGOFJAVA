package gof.structural.flyweight.pattern.concreteflyweight;

import gof.structural.flyweight.pattern.flyweight.Flyweight;

public class ConcreteFlyweight implements Flyweight{
	private String name;
	public ConcreteFlyweight(String name) {
		this.name = name;
	}

	@Override
	public String method() {
		return "We can draw/create something "+name;
	}

}
