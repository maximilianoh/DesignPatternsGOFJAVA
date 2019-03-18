package gof.structural.proxy.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gof.structural.proxy.pattern.proxy.Proxy;
import gof.structural.proxy.pattern.subject.Subject;

public class ProxyTest {
	@Test
	public void goodImplementions(){
		Subject s= new Proxy("example");
		s.request();
		assertEquals(s.request(),"RealSubject request with name example");
	}
}
