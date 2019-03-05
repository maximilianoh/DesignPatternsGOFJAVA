package gof.structural.facade.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gof.structural.facade.pattern.facade.Facade;

public class FacadeTest {
	@Test
	public void runSubsystems(){
		Facade facade=new Facade();
		assertEquals(facade.doSomethingInitSubs(),"succes Subsystem");
		assertEquals(facade.doSomethingInitSubs2(),"succes Subsystem2");
		assertEquals(facade.doSomethingInitSubs3(),"succes Subsystem3");
	}
	
	@Test
	public void runMultiSubsystems(){
		Facade facade=new Facade();
		assertEquals(facade.doSomethingInitMultiSubs(),"succes Subsystem3 succes Subsystem2");
	}
}
