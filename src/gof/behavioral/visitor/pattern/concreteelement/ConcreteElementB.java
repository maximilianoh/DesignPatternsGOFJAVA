package gof.behavioral.visitor.pattern.concreteelement;

import gof.behavioral.visitor.pattern.element.Element;
import gof.behavioral.visitor.pattern.visitor.Visitor;

public class ConcreteElementB extends Element{
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
