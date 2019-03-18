package gof.structural.proxy.pattern.realsubject;

import gof.structural.proxy.pattern.subject.Subject;

public class RealSubject implements Subject{
	private String name;

	public RealSubject(String name) {
		this.name = name;
	}

	@Override
	public String request() {
		return "RealSubject request with name "+name;
	}

}
