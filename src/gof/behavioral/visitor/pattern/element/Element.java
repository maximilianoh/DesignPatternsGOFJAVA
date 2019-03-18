package gof.behavioral.visitor.pattern.element;

import gof.behavioral.visitor.pattern.visitor.Visitor;

public abstract class Element {
	private String name="";
	public abstract void accept( Visitor visitor );
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
