package gof.creational.factory.pattern.concreteProduct;

import gof.creational.factory.pattern.product.Product;

public class ConcreteProduct extends Product{
	public ConcreteProduct() {
		this.type=this.type+"Concrete";
	}
}
