package gof.behavioral.iterator.pattern.iterator;

import gof.behavioral.iterator.pattern.concreteaggregate.ObjectExample;

public interface Iterator {
	public String first();
	public void next();
	public Boolean isDone();
	public String currentItem();
	public void addElement(ObjectExample o);
}
