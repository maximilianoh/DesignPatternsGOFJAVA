package gof.creational.abstractfactory.test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import gof.creational.abstractfactory.pattern.concretefactory.ConcreteFactory1;
import gof.creational.abstractfactory.pattern.concretefactory.ConcreteFactory2;
import gof.creational.abstractfactory.pattern.factory.AbstractFactory;

public class AbstractFactoryTest {
	@Test
	public void factory1Implementions(){
		AbstractFactory factory=new ConcreteFactory1();
		Assertions.assertAll(
	            () -> assertThat(factory.getType(),is("Factory1")),
	            () -> assertThat(factory.createProductA().getType(),is("ProductA")),
	            () -> assertThat(factory.createProductB().getType(),is("ProductB1"))
	    );
	}
	
	@Test
	public void factory2Implementions(){
		AbstractFactory factory=new ConcreteFactory2();
		Assertions.assertAll(
	            () -> assertThat(factory.getType(),is("Factory2")),
	            () -> assertThat(factory.createProductA().getType(),is("ProductA2")),
	            () -> assertThat(factory.createProductB().getType(),is("ProductB2"))
	    );
	}
}
