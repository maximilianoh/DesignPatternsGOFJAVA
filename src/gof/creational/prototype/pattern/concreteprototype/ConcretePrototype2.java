package gof.creational.prototype.pattern.concreteprototype;

import gof.creational.prototype.pattern.prototype.Prototype;

public class ConcretePrototype2 extends Prototype {
	private ConcretePrototype2() {}
	public ConcretePrototype2(String name, Object objectOtherThread) {
		super(name, objectOtherThread);
	}

	@Override
	public Prototype clone() {
		Prototype p=new  ConcretePrototype2();
		p.setName(this.getName());
		p.setObjectOtherThread(this.getObjectOtherThread());
		return p;
	}
	@Override
	public String fullName() {
		return this.getName()+" ConcretePrototype2";
	}

}
