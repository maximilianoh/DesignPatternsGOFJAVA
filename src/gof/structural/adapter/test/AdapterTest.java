package gof.structural.adapter.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gof.structural.adapter.pattern.adapter.Adapter;
import gof.structural.adapter.pattern.target.Target;

public class AdapterTest {
	@Test
	public void goodImplementions(){
		Target target=new Adapter();
		String texto=target.request(10);
		System.out.println(texto);
		assertEquals(texto.length(),10);
	}
}
