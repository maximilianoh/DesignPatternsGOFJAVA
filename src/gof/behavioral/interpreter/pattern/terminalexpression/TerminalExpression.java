package gof.behavioral.interpreter.pattern.terminalexpression;

import gof.behavioral.interpreter.pattern.expression.Expression;

public class TerminalExpression implements Expression{
	private  int n;
	
	public TerminalExpression(int n){
		this.n = n;
	}
	@Override
	public int interpret() {
		return n;
	}

}
