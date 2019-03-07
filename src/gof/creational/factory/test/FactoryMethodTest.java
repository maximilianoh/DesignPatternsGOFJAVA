package gof.creational.factory.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import gof.creational.factory.pattern.concreteCreator.ConcreteCreator;
import gof.creational.factory.pattern.creator.Creator;
import gof.creational.factory.pattern.product.Product;


public class FactoryMethodTest {
	@Test
	public void factory1Implementions(){
		Creator creator=new ConcreteCreator();
		Assertions.assertAll(
				() -> assertThat(creator.factoryMethod("tipo1"),isA(Product.class)),
	            () -> assertThat(creator.factoryMethod("tipo1").getType(),is("ProductConcrete"))
	           );
	}
	@Test
	public void factory2Implementions(){
		Creator creator=new ConcreteCreator();
		Assertions.assertAll(
				() -> assertThat(creator.factoryMethod("tipo2"),isA(Product.class)),
	            () -> assertThat(creator.factoryMethod("tipo2").getType(),is("ProductConcrete2"))
	           );
	}
}
