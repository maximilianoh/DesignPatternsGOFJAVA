package gof.structural.decorator.pattern.concreteDecorator;

import gof.structural.decorator.pattern.component.Component;
import gof.structural.decorator.pattern.decorator.Decorator;

public class ConcreteDecoratorB extends Decorator{

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public String operation() {
		return getComponent().operation()+" ConcreteDecoratorB";
	}
	
}
