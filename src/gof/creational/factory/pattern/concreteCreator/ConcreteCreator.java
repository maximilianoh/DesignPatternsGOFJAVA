package gof.creational.factory.pattern.concreteCreator;

import gof.creational.factory.pattern.concreteProduct.ConcreteProduct;
import gof.creational.factory.pattern.concreteProduct.ConcreteProduct2;
import gof.creational.factory.pattern.creator.Creator;
import gof.creational.factory.pattern.product.Product;

public class ConcreteCreator implements Creator{

	@Override
	public Product factoryMethod(String tipo) {
		if (!tipo.equals("tipo2"))return new ConcreteProduct();
		else {return new ConcreteProduct2();}
	}

}
