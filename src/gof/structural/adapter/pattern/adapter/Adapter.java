package gof.structural.adapter.pattern.adapter;

import gof.structural.adapter.pattern.adaptee.Adaptee;
import gof.structural.adapter.pattern.target.Target;

public class Adapter implements Target{

	@Override
	public String request(int range) {
		Adaptee ad=new Adaptee();
		return ad.specificRequest(range);
	}

}
