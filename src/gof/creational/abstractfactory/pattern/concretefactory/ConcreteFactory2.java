package gof.creational.abstractfactory.pattern.concretefactory;

import gof.creational.abstractfactory.pattern.concreteproduct.ProductA2;
import gof.creational.abstractfactory.pattern.concreteproduct.ProductB2;
import gof.creational.abstractfactory.pattern.factory.AbstractFactory;
import gof.creational.abstractfactory.pattern.product.AbstractProductA;
import gof.creational.abstractfactory.pattern.product.AbstractProductB;

public class ConcreteFactory2 extends AbstractFactory{
	public ConcreteFactory2() {
		this.type=this.type+"2";
	}
	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}
}
