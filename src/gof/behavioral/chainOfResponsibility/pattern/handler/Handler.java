package gof.behavioral.chainOfResponsibility.pattern.handler;

public abstract class Handler {
	private Handler successor;
	
	
	public Handler(Handler successor) {
		this.successor = successor;
	}

	protected abstract Boolean handleRequest(String text);
	public Boolean validateNext(String text) {
		Boolean condition;
		condition=handleRequest(text);
		if (successor!=null && condition) {
			condition=successor.validateNext(text);
			if (!condition)System.out.print("	Last works validations: ");
			
		}
		if (!condition) 
			System.out.println("Root Fail: "+this.getClass().getSimpleName());
		
		return condition;
	}


	
}
