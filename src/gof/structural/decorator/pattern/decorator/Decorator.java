package gof.structural.decorator.pattern.decorator;

import gof.structural.decorator.pattern.component.Component;

public abstract class Decorator implements Component{
	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	protected Component getComponent() {
		return component;
	}
	
}
