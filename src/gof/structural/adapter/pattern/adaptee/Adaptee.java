package gof.structural.adapter.pattern.adaptee;

import java.util.Random;
import java.util.stream.IntStream;

public class Adaptee {
	private final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final String lower = upper.toLowerCase();
	private final String digits = "0123456789";
	private final String alphanum = upper + lower + digits;
	private static String procesamiento="";
	public String specificRequest(int rango) {
		System.out.println("No puedo ver ni cambiar el codigo fuente "
				+ "que tiene esta clase");
		IntStream.range(0,rango)
			.forEach(entero->{
				procesamiento+=Character.toString(
					alphanum.charAt(new Random()
							.nextInt(alphanum.length())));
		});
		
		return procesamiento;
	}
}
