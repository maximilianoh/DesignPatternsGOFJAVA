package gof.behavioral.mediator.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gof.behavioral.mediator.pattern.colleague.Colleague;
import gof.behavioral.mediator.pattern.concretecolleague.ConcreteColleague;
import gof.behavioral.mediator.pattern.concretemediator.ConcreteMediator;
import gof.behavioral.mediator.pattern.mediator.Mediator;

public class MediatorTest {
	@Test
	public void goodOneMessage(){
		Mediator m = new ConcreteMediator();
		Colleague c1 = new ConcreteColleague( m ,"C1");
		Colleague c3 = new ConcreteColleague( m ,"C3");
		m.addColleague(c1);
        m.addColleague(c3);
		assertEquals(c3.comunicar("Mensaje de prueba",c1),
				"C1 received: Mensaje de prueba. From C3");
	}
	@Test
	public void goodAllMessage(){
		Mediator m = new ConcreteMediator();
		Colleague c1 = new ConcreteColleague(m,"C1");
		Colleague c2 = new ConcreteColleague(m,"C2");
		Colleague c3 = new ConcreteColleague(m,"C3");
		Colleague c4 = new ConcreteColleague(m,"C4");
        m.addColleague(c1);
        m.addColleague(c2);
        m.addColleague(c3);
        m.addColleague(c4);
        
        assertEquals(c1.comunicarTodos("Aviso a todos"),
				"C2 received: Aviso a todos. From C1 "
				+ "C3 received: Aviso a todos. From C1 "
				+ "C4 received: Aviso a todos. From C1 ");
	}
}
