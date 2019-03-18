package gof.creational.prototype.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import gof.creational.prototype.pattern.concreteprototype.ConcretePrototype1;
import gof.creational.prototype.pattern.prototype.Prototype;

public class PrototypeTest {
	@Test
	public void goodImplementions(){
		Prototype pro= new ConcretePrototype1("name1", new Object());
		Prototype pro2=pro.clone();
		Assertions.assertAll(
				() -> assertThat(pro.fullName(),
						is("name1 ConcretePrototype1")),
				() -> assertThat(pro2.fullName(),
						is("name1 ConcretePrototype1")),
				() -> pro2.setName("name2"),
				() -> assertThat(pro.fullName(),
						is("name1 ConcretePrototype1")),
				() -> assertThat(pro2.fullName(),
						is("name2 ConcretePrototype1"))
			);
	}
}
