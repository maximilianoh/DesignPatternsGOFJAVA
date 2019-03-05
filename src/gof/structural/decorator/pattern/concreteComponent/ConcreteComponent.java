package gof.structural.decorator.pattern.concreteComponent;

import gof.structural.decorator.pattern.component.Component;

public class ConcreteComponent implements Component{
	@Override
	public String operation() {
		return "Componente concreto";
	}
	
}
