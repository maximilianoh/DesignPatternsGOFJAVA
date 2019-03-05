package gof.behavioral.chainOfResponsibility.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gof.behavioral.chainOfResponsibility.pattern.concreteHandler.ConcreteHandler;
import gof.behavioral.chainOfResponsibility.pattern.concreteHandler.ConcreteHandler2;
import gof.behavioral.chainOfResponsibility.pattern.concreteHandler.ConcreteHandler3;
import gof.behavioral.chainOfResponsibility.pattern.handler.Handler;

public class ChainOfResponsibilityTest {
	@Test
	public void testImplementions(){
		Handler handler=new ConcreteHandler /*check null*/
				(new ConcreteHandler2/*check empty*/
						(new ConcreteHandler3/*check length>3*/
								(null)));
		assertEquals(handler.validateNext(null),false);
	}
	@Test
	public void testImplementions2(){
		Handler handler=new ConcreteHandler /*check null*/
				(new ConcreteHandler2/*check empty*/
						(new ConcreteHandler3/*check length>3*/
								(null)));
		assertEquals(handler.validateNext(""),false);
	}
	
	@Test
	public void testImplementions3(){
		Handler handler=new ConcreteHandler /*check null*/
				(new ConcreteHandler2/*check empty*/
						(new ConcreteHandler3/*check length>3*/
								(null)));
		assertEquals(handler.validateNext("ss"),false);
	}
	
	@Test
	public void testImplementions4(){
		Handler handler=new ConcreteHandler /*check null*/
				(new ConcreteHandler2/*check empty*/
						(new ConcreteHandler3/*check length>3*/
								(null)));
		assertEquals(handler.validateNext("aaaa"),true);
	}
}
