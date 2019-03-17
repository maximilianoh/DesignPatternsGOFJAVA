package gof.structural.composite.pattern.composite;

import java.util.ArrayList;
import java.util.List;

import gof.structural.composite.pattern.component.Component;

public class Composite implements Component{
	List<Component> componentesHijos=new ArrayList<>();
	@Override
	public String operation() {
		String s="";
		for (Component component : componentesHijos) {
			s+=component.operation()+" ";
		}
		return s;
	}

	public void add(Component c) {
		componentesHijos.add(c);		
	}

	public void remove(Component c) {
		componentesHijos.remove(c);
	}

	public void getChild(int index) {
		componentesHijos.get(index);
	}

}
