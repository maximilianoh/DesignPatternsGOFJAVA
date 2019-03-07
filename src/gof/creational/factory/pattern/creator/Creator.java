package gof.creational.factory.pattern.creator;

import gof.creational.factory.pattern.product.Product;

public interface Creator {
	public Product factoryMethod(String tipo);
}
