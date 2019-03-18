package gof.creational.prototype.pattern.concreteprototype;

import gof.creational.prototype.pattern.prototype.Prototype;

public class ConcretePrototype1 extends Prototype{
	private ConcretePrototype1() {}
	public ConcretePrototype1(String name, Object objectOtherThread) {
		super(name, objectOtherThread);
	}

	@Override
	public Prototype clone() {
		Prototype p=new  ConcretePrototype1();
		p.setName(this.getName());
		p.setObjectOtherThread(this.getObjectOtherThread());
		return p;
	}
	@Override
	public String fullName() {
		return this.getName()+" ConcretePrototype1";
	}
	
}
