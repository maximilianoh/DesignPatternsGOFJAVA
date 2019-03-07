package gof.creational.abstractFactory.pattern.concreteFactory;

import gof.creational.abstractFactory.pattern.concreteProduct.ProductA;
import gof.creational.abstractFactory.pattern.concreteProduct.ProductB;
import gof.creational.abstractFactory.pattern.factory.AbstractFactory;
import gof.creational.abstractFactory.pattern.product.AbstractProductA;
import gof.creational.abstractFactory.pattern.product.AbstractProductB;

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
