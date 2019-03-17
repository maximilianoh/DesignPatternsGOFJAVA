package gof.behavioral.iterator.pattern.aggregate;

import java.util.Collection;

import gof.behavioral.iterator.pattern.concreteaggregate.ObjectExample;
import gof.behavioral.iterator.pattern.iterator.Iterator;

public interface Aggregate {
	public Iterator createIterator();
	public Collection<ObjectExample> getColeccion();
	public void setColeccion(Collection<ObjectExample> coleccion);
}
