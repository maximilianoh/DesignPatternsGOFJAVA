package gof.behavioral.state.test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import gof.behavioral.state.pattern.context.Context;
public class StateTest {
	@Test
	public void goodImplementions(){
		Context context = new Context();
		Assertions.assertAll(
				() -> assertThat(context.request(),is("StateA")),
				() -> assertThat(context.request(),is("StateB")),
				() -> assertThat(context.request(),is("StateC")),
				() -> assertThat(context.request(),is("EndState")),
				() -> assertThat(context.request(),is("EndState"))
	           );
	}
}
