package gof.behavioral.memento.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import gof.behavioral.memento.pattern.caretaker.Caretaker;
import gof.behavioral.memento.pattern.originator.Originator;


public class MementoTest {
	@Test
	public void goodImplementions(){
		Caretaker caretaker = new Caretaker();        
		Originator o= new Originator();
		caretaker.addMemento(o.createMemento("estado 1"));     
		caretaker.addMemento(o.createMemento("estado 2"));            
		caretaker.addMemento(o.createMemento("estado 3"));                
		caretaker.addMemento(o.createMemento("estado 4"));
		Assertions.assertAll(
				() -> assertThat(caretaker.getMementoUndoState(),is("estado 4")),
	            () -> assertThat(caretaker.getMementoUndoState(),is("estado 3")),
	            () -> assertThat(caretaker.getMementoUndoState(),is("estado 2")),
	            () -> assertThat(caretaker.getMementoUndoState(),is("estado 1")),
	            () -> assertThat(caretaker.getMementoUndoState(),is("Sin estados para volver")),
	            () -> assertThat(caretaker.getMementoRedoState(),is("estado 2")),
	            () -> assertThat(caretaker.getMementoRedoState(),is("estado 3")),
				() -> assertThat(caretaker.getMementoRedoState(),is("estado 4")),
				() -> assertThat(caretaker.getMementoRedoState(),is("No hay estados a rehacer"))
	            
				);
		assertEquals(true,true);
	}
}
