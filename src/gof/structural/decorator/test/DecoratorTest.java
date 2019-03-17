package gof.structural.decorator.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import gof.structural.decorator.pattern.component.Component;
import gof.structural.decorator.pattern.concretecomponent.ConcreteComponent;
import gof.structural.decorator.pattern.concretedecorator.ConcreteDecoratorA;
import gof.structural.decorator.pattern.concretedecorator.ConcreteDecoratorB;
public class DecoratorTest {
	@Test
	public void twoDecorator(){
		Component component= new ConcreteDecoratorA(new ConcreteDecoratorB(
				new ConcreteComponent()));
		assertEquals(component.operation(),"Componente concreto ConcreteDecoratorB ConcreteDecoratorA");
	}
	@Test
	public void oneDecorator(){
		Component component= new ConcreteDecoratorB(
				new ConcreteComponent());
		assertEquals(component.operation(),"Componente concreto ConcreteDecoratorB");
	}
}
