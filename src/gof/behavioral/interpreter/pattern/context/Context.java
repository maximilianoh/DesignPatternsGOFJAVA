package gof.behavioral.interpreter.pattern.context;

import java.util.HashMap;
import java.util.Map;

import gof.behavioral.interpreter.pattern.expression.Expression;
import gof.behavioral.interpreter.pattern.nonterminalexpression.NonTerminalExpression;
import gof.behavioral.interpreter.pattern.nonterminalexpression.NonTerminalExpressionRestar;
import gof.behavioral.interpreter.pattern.nonterminalexpression.NonTerminalExpressionSumar;

public class Context {
	private Map<String, NonTerminalExpression> operations=new HashMap<>();
	
	public Context() {
		operations.put("SUMAR", new NonTerminalExpressionSumar());
		operations.put("RESTAR", new NonTerminalExpressionRestar());
	}

	public boolean isOperator(String s) {
		
		if (operations.containsKey(s))
			return true;
		else
			return false;
	}
	
	public Expression getOperator(String s,Expression left,Expression right) {
		NonTerminalExpression nte=operations.get(s);
		nte.setExpressions(left, right);
		return nte;
	}

	public void addOperations(String key, NonTerminalExpression exp) {
		this.operations.put(key, exp);
	}
	
	
}
