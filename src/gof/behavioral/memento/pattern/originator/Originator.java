package gof.behavioral.memento.pattern.originator;

import gof.behavioral.memento.pattern.memento.Memento;

public class Originator { 
	private String state;
	public Memento createMemento(String state) {
		return new Memento(state);
	}  
	public void restoreFromMemento(Memento memento) {
		state=memento.getState();
	}
	public String getState() {
		return state;
	}
}
