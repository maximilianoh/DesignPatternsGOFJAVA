package gof.creational.builder.pattern.director;

import gof.creational.builder.pattern.builder.Builder;
import gof.creational.builder.pattern.product.Product;

public class Director {
	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.createProduct();
	}
	public Product getProduct() {
		return builder.getProduct();
	}
}
