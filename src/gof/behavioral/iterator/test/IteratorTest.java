package gof.behavioral.iterator.test;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.hamcrest.CoreMatchers.*;

import gof.behavioral.iterator.pattern.concreteaggregate.ConcreteAggregate;
import gof.behavioral.iterator.pattern.concreteaggregate.ObjectExample;
import gof.behavioral.iterator.pattern.iterator.Iterator;

public class IteratorTest {
	@Test
	public void goodImplementions(){
		ConcreteAggregate aggregate=new ConcreteAggregate();
		Iterator it=aggregate.createIterator();
		
		it.addElement(new ObjectExample("object 1"));
		it.addElement(new ObjectExample("object 2"));
		it.addElement(new ObjectExample("object 3"));
		Assertions.assertAll(
				() -> assertThat(it.isDone(),is(false)),
				() -> assertThat(it.currentItem(),is("object 3")),
				()->  it.next(),
				() -> assertThat(it.currentItem(),is("object 2")),
				()->  it.next(),
				() -> assertThat(it.currentItem(),is("object 1")),
				()->  it.next(),
				() -> assertThat(it.isDone(),is(true))
	           );
	}
}
