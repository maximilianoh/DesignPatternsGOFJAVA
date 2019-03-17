package gof.behavioral.interpreter.pattern.nonterminalexpression;

import gof.behavioral.interpreter.pattern.expression.Expression;

public abstract class NonTerminalExpression implements Expression {
	protected Expression leftExpression;
	protected Expression rightExpression;
	public void setExpressions(Expression left,Expression right) {
		leftExpression=left;
		rightExpression=right;
	}
}
