package gof.creational.abstractfactory.pattern.concretefactory;

import gof.creational.abstractfactory.pattern.concreteproduct.ProductA;
import gof.creational.abstractfactory.pattern.concreteproduct.ProductB;
import gof.creational.abstractfactory.pattern.factory.AbstractFactory;
import gof.creational.abstractfactory.pattern.product.AbstractProductA;
import gof.creational.abstractfactory.pattern.product.AbstractProductB;

public class ConcreteFactory1 extends AbstractFactory{
	public ConcreteFactory1() {
		this.type=this.type+"1";
	}
	@Override
	public AbstractProductA createProductA() {
		return new ProductA();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB();
	}

}
