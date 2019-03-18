package gof.structural.flyweight.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import gof.structural.flyweight.pattern.flyweight.Flyweight;
import gof.structural.flyweight.pattern.flyweightfactory.FlyweightFactory;

public class FlyweightTest {
	@Test
	public void goodImplementions(){
		FlyweightFactory fact=new FlyweightFactory();
		Flyweight f1=fact.getFlyweights("Blue");
		Flyweight f2=fact.getFlyweights("Red");
		Flyweight f3=fact.getFlyweights("Green");
		Assertions.assertAll(
			() -> assertThat(f1.method(),
					is("We can draw/create something Blue")),
			() -> assertThat(f2.method(),
					is("We can draw/create something Red")),
			() -> assertThat(f3.method(),
					is("We can draw/create something Green"))
		);
	}
}
