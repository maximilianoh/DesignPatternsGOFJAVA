package gof.behavioral.observer.pattern.concreteobserver;

import gof.behavioral.observer.pattern.observer.Observer;

public class ConcreteObserver implements Observer{
	private String typeObserver;
	
	public ConcreteObserver(String typeObserver) {
		this.typeObserver = typeObserver;
	}
	
	
	public String getTypeObserver() {
		return typeObserver;
	}


	@Override
	public String update(Object event) {
		System.out.println("Update "+typeObserver+" from "+event);
		return "Update "+typeObserver+" from "+event;
	}

}
