package gof.behavioral.mediator.pattern.concretecolleague;

import gof.behavioral.mediator.pattern.colleague.Colleague;
import gof.behavioral.mediator.pattern.mediator.Mediator;

public class ConcreteColleague extends Colleague{
    public ConcreteColleague(Mediator m,String name) {
        this.setMediador( m );
        this.name=name;
    }
    @Override
     public String sendColleague(String mensaje,Colleague from){
    	return this.name+" received: " + mensaje +". From "+from.getName();
    }

}
