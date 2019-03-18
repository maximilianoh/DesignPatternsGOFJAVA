package gof.behavioral.visitor.pattern.visitor;

import java.util.List;

import gof.behavioral.visitor.pattern.element.Element;

public interface Visitor {
	public void visit( Element ce1);
    public void visit( List<Element> elementList );
}
