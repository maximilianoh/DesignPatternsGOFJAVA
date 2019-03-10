package gof.behavioral.memento.pattern.caretaker;

import java.util.ArrayList;
import java.util.List;

import gof.behavioral.memento.pattern.memento.Memento;

public class Caretaker {
	private List<Memento> estados = new ArrayList<Memento>(); 
	private int pointer=0;
	public void addMemento(Memento m) {        
		estados.add(m);
		pointer++;
	}    
	public Memento getMementoUndo() {
		if (pointer>0)return estados.get(--pointer);
		else return null;
	}
	public Memento getMementoRedo() {
		if (pointer<estados.size()-1)return estados.get(++pointer);   
		else return null;
	}
	public String getMementoUndoState() {
		if (pointer>0)return estados.get(--pointer).getState();
		else return "Sin estados para volver";
	}
	public String getMementoRedoState() {
		if (pointer<estados.size()-1)return estados.get(++pointer).getState();   
		else return "No hay estados a rehacer";
	}
}
