package gof.behavioral.mediator.pattern.concretemediator;

import java.util.ArrayList;

import gof.behavioral.mediator.pattern.colleague.Colleague;
import gof.behavioral.mediator.pattern.mediator.Mediator;

public class ConcreteMediator implements Mediator{
	private ArrayList<Colleague> colegas;
    public ConcreteMediator(){
        this.colegas = new ArrayList<Colleague>();
    }
    public void addColleague(Colleague colega){
        this.colegas.add( colega );
    }
    @Override
     public String send(String mensaje, Colleague originator, Colleague receiver){
    	return receiver.sendColleague( mensaje ,originator);
    }
	@Override
	public String sendAll(String mensaje, Colleague emisor) {
		String text="";
		for (Colleague colleague : colegas) {
			if (!colleague.equals(emisor))
				text+=colleague.sendColleague(mensaje, emisor)+" ";
		}
		return text;
	}
    

}
