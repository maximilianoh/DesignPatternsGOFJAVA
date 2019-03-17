package gof.behavioral.template.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import gof.behavioral.template.pattern.abstractclass.AbstractClass;
import gof.behavioral.template.pattern.concreteclass.ConcreteClass;
import gof.behavioral.template.pattern.concreteclass.ConcreteClass2;

public class TemplateMethodTest {
	@Test
	public void tryFunction(){
		AbstractClass templateMethod=new ConcreteClass();
		assertEquals(templateMethod.templateMethod(),true);
	}
	@Test
	public void exceptionFunction(){
		AbstractClass templateMethod=new ConcreteClass2();
		assertEquals(templateMethod.templateMethod(),false);
	}
}
