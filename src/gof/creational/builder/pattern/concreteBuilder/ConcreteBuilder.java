package gof.creational.builder.pattern.concreteBuilder;

import gof.creational.builder.pattern.builder.Builder;

public class ConcreteBuilder extends Builder{
	@Override
	public void buildName(String name) {
		 this.name=name;
	}

	@Override
	public void buildInfo(String info) {
		this.info=info;
	}

	@Override
	public void builModel(String model) {
		this.model=model;
	}

}
