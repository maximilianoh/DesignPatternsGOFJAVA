package gof.structural.composite.pattern.leaf;

import gof.structural.composite.pattern.component.Component;

public class Leaf  implements Component{
	private String name;
	
	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public String operation() {
		return name;
	}
}
