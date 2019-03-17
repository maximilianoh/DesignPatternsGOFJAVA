package gof.behavioral.iterator.pattern.concreteaggregate;

import java.util.Collection;
import gof.behavioral.iterator.pattern.aggregate.Aggregate;
import gof.behavioral.iterator.pattern.concreteiterator.ConcreteInverseIterator;
import gof.behavioral.iterator.pattern.iterator.Iterator;

public class ConcreteAggregate implements Aggregate{
	private Collection<ObjectExample> coleccion;
	@Override
	public Iterator createIterator() {
		return new ConcreteInverseIterator(this);
	}
	
	public Collection<ObjectExample> getColeccion() {
		return coleccion;
	}

	public void setColeccion(Collection<ObjectExample> coleccion) {
		this.coleccion = coleccion;
	}
	
}
