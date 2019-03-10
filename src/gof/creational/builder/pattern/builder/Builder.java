package gof.creational.builder.pattern.builder;

import gof.creational.builder.pattern.product.Product;

public abstract class Builder {
	protected Product product;
	protected String name;
	protected String info;
	protected String model;
	public void createProduct() {
		product=new Product();
		product.setName(name);
		product.setInfo(info);
		product.setModel(model);
	}
	
	public Product getProduct() {
		return product;
	}

	public abstract void buildName(String name);
	public abstract void buildInfo(String info);
	public abstract void builModel(String model);
}
