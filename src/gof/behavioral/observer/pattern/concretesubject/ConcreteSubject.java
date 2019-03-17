package gof.behavioral.observer.pattern.concretesubject;

import gof.behavioral.observer.pattern.subject.Subject;

public class ConcreteSubject extends Subject{
	private String name;
	public ConcreteSubject(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
		publicar();
	}

	public void publicar() {
		notifys(this);
	}
	@Override
	public String toString() {
		return "ConcreteSubject [name=" + name + "]";
	}
	
}
