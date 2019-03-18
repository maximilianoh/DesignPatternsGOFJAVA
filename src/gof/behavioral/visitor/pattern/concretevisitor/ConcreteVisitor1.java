package gof.behavioral.visitor.pattern.concretevisitor;

import java.util.List;

import gof.behavioral.visitor.pattern.element.Element;
import gof.behavioral.visitor.pattern.visitor.Visitor;

public class ConcreteVisitor1 implements Visitor{

	@Override
	public void visit(Element e1) {
		e1.setName(e1.getClass().getSimpleName()+" from ConcreteVisitor1");
	}

	@Override
	public void visit(List<Element> elementList) {
		for (Element element : elementList) {
			element.accept(this);;
		}
	}

}
