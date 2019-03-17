package gof.behavioral.observer.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gof.behavioral.observer.pattern.concreteobserver.ConcreteObserver;
import gof.behavioral.observer.pattern.concretesubject.ConcreteSubject;
import gof.behavioral.observer.pattern.observer.Observer;

public class ObserverTest {
	@Test
	public void errorImplementions(){
		ConcreteSubject subject=new ConcreteSubject("Subject");
		Observer observer=new ConcreteObserver("Observer");
		Observer observer2=new ConcreteObserver("Observer2");
		subject.attach(observer);
		subject.attach(observer2);
		subject.publicar();
		assertEquals(subject.notifys(subject),
				"Update Observer from ConcreteSubject [name=Subject] "
				+ "Update Observer2 from ConcreteSubject "
				+ "[name=Subject] ");
		subject.setName("Subject2");
		assertEquals(subject.notifys(subject),
				"Update Observer from ConcreteSubject [name=Subject2] "
				+ "Update Observer2 from ConcreteSubject "
				+ "[name=Subject2] ");
	}
}
