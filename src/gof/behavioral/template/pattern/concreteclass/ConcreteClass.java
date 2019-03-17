package gof.behavioral.template.pattern.concreteclass;

import gof.behavioral.template.pattern.abstractclass.AbstractClass;

public class ConcreteClass extends AbstractClass{

	@Override
	protected void primitiveOperation() {
		System.out.println("Primitive Op 1");
	}

	@Override
	protected void primitiveOperation2() {
		System.out.println("Primitive Op 2");
	}

}
