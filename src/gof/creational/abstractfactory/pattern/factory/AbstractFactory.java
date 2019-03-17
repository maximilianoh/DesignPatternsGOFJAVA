package gof.creational.abstractfactory.pattern.factory;

import gof.creational.abstractfactory.pattern.product.AbstractProductA;
import gof.creational.abstractfactory.pattern.product.AbstractProductB;

public abstract class AbstractFactory {
	protected String type="Factory";
	public abstract AbstractProductA createProductA();
	public abstract AbstractProductB createProductB();
	public String getType() {
		return type;
	}
	
}
