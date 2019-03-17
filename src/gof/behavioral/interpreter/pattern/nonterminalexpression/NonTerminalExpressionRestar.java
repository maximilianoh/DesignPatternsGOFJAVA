package gof.behavioral.interpreter.pattern.nonterminalexpression;


public class NonTerminalExpressionRestar extends NonTerminalExpression{
	@Override
	public int interpret() {
		return leftExpression.interpret() - rightExpression.interpret();
	}

}
