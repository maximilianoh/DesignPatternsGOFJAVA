package gof.creational.abstractFactory.pattern.concreteFactory;

import gof.creational.abstractFactory.pattern.concreteProduct.ProductA2;
import gof.creational.abstractFactory.pattern.concreteProduct.ProductB2;
import gof.creational.abstractFactory.pattern.factory.AbstractFactory;
import gof.creational.abstractFactory.pattern.product.AbstractProductA;
import gof.creational.abstractFactory.pattern.product.AbstractProductB;

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
