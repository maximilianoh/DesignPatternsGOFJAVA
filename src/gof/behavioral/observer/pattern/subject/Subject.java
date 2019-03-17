package gof.behavioral.observer.pattern.subject;

import java.util.ArrayList;
import java.util.List;

import gof.behavioral.observer.pattern.observer.Observer;

public abstract class Subject {
	private List<Observer> observers=new ArrayList<>();
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	public String notifys(Subject subject) {
		String texto="";
		for (Observer observer : observers) {
			texto+=observer.update(subject)+" ";
		}
		return texto;
	}
}
