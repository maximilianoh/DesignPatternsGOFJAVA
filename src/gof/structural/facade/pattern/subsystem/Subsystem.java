package gof.structural.facade.pattern.subsystem;

public class Subsystem {

	public String work() {
		System.out.println("enabled Subsystem");
		System.out.println("configured Subsystem");
		System.out.println("create log from Subsystem");
		System.out.println("init Subsystem");		
		System.out.println("start Subsystem");
		return "succes Subsystem";
	}

}
