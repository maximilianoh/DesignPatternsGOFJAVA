package gof.creational.abstractFactory.pattern.factory;

import gof.creational.abstractFactory.pattern.product.AbstractProductA;
import gof.creational.abstractFactory.pattern.product.AbstractProductB;

public abstract class AbstractFactory {
	protected String type="Factory";
	public abstract AbstractProductA createProductA();
	public abstract AbstractProductB createProductB();
	public String getType() {
		return type;
	}
	
}
