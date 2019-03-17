package gof.structural.composite.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gof.structural.composite.pattern.component.Component;
import gof.structural.composite.pattern.composite.Composite;
import gof.structural.composite.pattern.leaf.Leaf;

public class CompositeTest {
	@Test
	public void goodImplementions(){
		Component elemento1=new Leaf("name 1");
		Component elemento2=new Leaf("name 2");
		Component elemento3=new Leaf("name 3");
		Component elemento4=new Leaf("name 4");
		Component elemento5=new Leaf("name 5");
		Composite fatherElement=new Composite();
		Composite fatherElement2=new Composite();
		Composite fatherElement3=new Composite();
		fatherElement3.add(elemento4);
		fatherElement2.add(elemento1);
		fatherElement.add(elemento5);
		fatherElement.add(elemento3);
		fatherElement.add(elemento2);
		fatherElement.add(fatherElement2);
		
		assertEquals(fatherElement.operation(),"name 5 name 3 name 2 name 1  ");
	}
}
