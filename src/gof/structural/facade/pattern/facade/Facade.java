package gof.structural.facade.pattern.facade;

import gof.structural.facade.pattern.subsystem.Subsystem;
import gof.structural.facade.pattern.subsystem.Subsystem2;
import gof.structural.facade.pattern.subsystem.Subsystem3;

public class Facade {
	private Subsystem subsystem;
	private Subsystem2 subsystem2;
	private Subsystem3 subsystem3;
	public Facade() {
		subsystem=new Subsystem();
		subsystem2=new Subsystem2();
		subsystem3=new Subsystem3();
	}
	
	public String doSomethingInitSubs(){
		return subsystem.work();
	}
	
	public String doSomethingInitSubs2(){
		return subsystem2.run();	
	}

	public String doSomethingInitSubs3(){
		return subsystem3.exec();
	}
	
	public String doSomethingInitMultiSubs(){
		return subsystem3.exec() +" "+subsystem2.run();
	}
	
}
