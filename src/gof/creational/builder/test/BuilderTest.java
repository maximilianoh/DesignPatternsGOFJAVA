package gof.creational.builder.test;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import gof.creational.builder.pattern.builder.Builder;
import gof.creational.builder.pattern.concreteBuilder.ConcreteBuilder;
import gof.creational.builder.pattern.director.Director;

public class BuilderTest {
	@Test
	public void errorImplementions(){
		Builder builder=new ConcreteBuilder();
		builder.buildInfo("info1");
		builder.buildName("name1");
		builder.builModel("model1");
		Director director=new Director(builder);
		director.construct();
		
		Assertions.assertAll(
				() -> assertThat(director.getProduct().getName(),is("name1")),
	            () -> assertThat(director.getProduct().getInfo(),is("info1")),
	            () -> assertThat(director.getProduct().getModel(),is("model1"))
	           );
	}
}
