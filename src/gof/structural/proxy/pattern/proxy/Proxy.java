package gof.structural.proxy.pattern.proxy;

import gof.structural.proxy.pattern.realsubject.RealSubject;
import gof.structural.proxy.pattern.subject.Subject;

public class Proxy implements Subject{
	private RealSubject r;
	private String nameSubject;
	
	public Proxy(String nameSubject) {
		this.nameSubject = nameSubject;
	}

	@Override
	public String request() {
		if(r == null){
			r = new RealSubject (nameSubject);
		}
		return this.r.request();
	}

}
