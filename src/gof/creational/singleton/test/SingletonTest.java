package gof.creational.singleton.test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import gof.creational.singleton.pattern.singleton.Singleton;

public class SingletonTest {
	@Test
	public void sameInstance(){
		Singleton singleton=Singleton.getInstance();
		Singleton singleton2=Singleton.getInstance();
		assertEquals(singleton,singleton2);
	}
}
