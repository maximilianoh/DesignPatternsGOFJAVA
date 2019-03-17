package gof.behavioral.iterator.pattern.concreteiterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import gof.behavioral.iterator.pattern.aggregate.Aggregate;
import gof.behavioral.iterator.pattern.concreteaggregate.ObjectExample;
import gof.behavioral.iterator.pattern.iterator.Iterator;

public class ConcreteInverseIterator implements Iterator{
	private Aggregate aggregate;
	private int position=0;
	
	private List<ObjectExample> getArray(Collection<ObjectExample> c) {
		return new ArrayList<>(c);
	}
	
	public ConcreteInverseIterator(Aggregate concreteAggregate) {
		aggregate=concreteAggregate;
		aggregate.setColeccion(new ArrayList<>());
	}
	@Override
	public String first() {
		if(!aggregate.getColeccion().isEmpty()){
			position=aggregate.getColeccion().size()-1;
			return getArray(aggregate.getColeccion()).get(position).getName();
		}
		return "No hay elementos";
	}

	@Override
	public void next() {
		if (position>-1) {
			position--;
		}
	}

	@Override
	public Boolean isDone() {
		if (position==-1) {
			return true;
		}
		return false;
	}

	@Override
	public String currentItem() {
		return getArray(aggregate.getColeccion()).get(position).getName();
	}
	@Override
	public void addElement(ObjectExample o) {
		aggregate.getColeccion().add(o);
		position=aggregate.getColeccion().size()-1;
	}

}
