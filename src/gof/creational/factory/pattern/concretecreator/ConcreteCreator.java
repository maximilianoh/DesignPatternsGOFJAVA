package gof.creational.factory.pattern.concretecreator;

import gof.creational.factory.pattern.concreteproduct.ConcreteProduct;
import gof.creational.factory.pattern.concreteproduct.ConcreteProduct2;
import gof.creational.factory.pattern.creator.Creator;
import gof.creational.factory.pattern.product.Product;

public class ConcreteCreator implements Creator{

	@Override
	public Product factoryMethod(String tipo) {
		if (!tipo.equals("tipo2"))return new ConcreteProduct();
		else {return new ConcreteProduct2();}
	}

}
