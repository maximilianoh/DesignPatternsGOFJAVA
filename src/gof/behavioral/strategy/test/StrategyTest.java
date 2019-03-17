package gof.behavioral.strategy.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;


import gof.behavioral.strategy.pattern.context.Context;

public class StrategyTest {
	@Test
	public void goodImplementions(){
		Context c=new Context();
		c.setStrategy(0);
		Assertions.assertAll(
					() -> assertThat(c.contextInterface(),is("Strategy0")),
					() -> c.setStrategy(1),
		            () -> assertThat(c.contextInterface(),is("Strategy1"))
		           );
	}
}
