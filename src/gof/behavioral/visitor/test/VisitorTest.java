package gof.behavioral.visitor.test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import gof.behavioral.visitor.pattern.concreteelement.ConcreteElementA;
import gof.behavioral.visitor.pattern.concreteelement.ConcreteElementB;
import gof.behavioral.visitor.pattern.concretevisitor.ConcreteVisitor1;
import gof.behavioral.visitor.pattern.concretevisitor.ConcreteVisitor2;
import gof.behavioral.visitor.pattern.element.Element;
import gof.behavioral.visitor.pattern.visitor.Visitor;

public class VisitorTest {
	@Test
	public void goodImplementions(){
		Visitor v=new ConcreteVisitor1();
		Visitor v2=new ConcreteVisitor2();
		
		ConcreteElementA e1= new ConcreteElementA();
		ConcreteElementB e2= new ConcreteElementB();
		List<Element> listElement=new ArrayList<>();
		listElement.add(e1);
		listElement.add(e2);
		
		e1.accept(v);
		Assertions.assertAll(
			() -> assertThat(e1.getName(),is("ConcreteElementA from ConcreteVisitor1")),
	        () -> v2.visit(listElement),
	        () -> assertThat(e1.getName(),is("ConcreteElementA from ConcreteVisitor2")),
	        () -> assertThat(e2.getName(),is("ConcreteElementB from ConcreteVisitor2"))
	    );
	}
	
}
