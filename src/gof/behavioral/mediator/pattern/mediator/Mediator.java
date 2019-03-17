package gof.behavioral.mediator.pattern.mediator;

import gof.behavioral.mediator.pattern.colleague.Colleague;

public interface Mediator {
	public String send(String mensaje, Colleague emisor, Colleague receiver);
	public String sendAll(String mensaje, Colleague emisor);
	public void addColleague(Colleague colega);
}
