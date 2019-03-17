package gof.behavioral.mediator.pattern.colleague;

import gof.behavioral.mediator.pattern.mediator.Mediator;

public abstract class Colleague {
    protected Mediator mediador;
    protected String name;
    public Mediator getMediador(){
        return this.mediador;
    }
    public void setMediador( Mediator m ){
        this.mediador = m;
    }
    public String comunicar(String mensaje, Colleague receiver){
        return this.getMediador().send(mensaje, this, receiver);
    }
    public String comunicarTodos(String mensaje){
        return this.getMediador().sendAll(mensaje, this);
    }
     
    public String getName() {
		return name;
	}
    public abstract String sendColleague(String mensaje, Colleague from);
}
