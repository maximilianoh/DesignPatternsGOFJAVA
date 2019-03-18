package gof.structural.bridge.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import gof.structural.bridge.pattern.abstraction.Abstraction;
import gof.structural.bridge.pattern.concreteimplementor.ConcreteImplementor1;
import gof.structural.bridge.pattern.concreteimplementor.ConcreteImplementor2;
import gof.structural.bridge.pattern.refinedabstraction.RefinedAbstraction;

public class BridgeTest {
	@Test
	public void goodImplementions(){
		Abstraction abs=new RefinedAbstraction(new ConcreteImplementor1());
		Assertions.assertAll(
				() -> assertThat(abs.function(),
						is("Implementation from ConcreteImplementor1")),
				() -> abs.setImpl(new ConcreteImplementor2()),
				() -> assertThat(abs.function(),
						is("Implementation from ConcreteImplementor2"))
		);
	}
}
