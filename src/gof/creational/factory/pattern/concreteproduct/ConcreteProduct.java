package gof.creational.factory.pattern.concreteproduct;

import gof.creational.factory.pattern.product.Product;

public class ConcreteProduct extends Product{
	public ConcreteProduct() {
		this.type=this.type+"Concrete";
	}
}
