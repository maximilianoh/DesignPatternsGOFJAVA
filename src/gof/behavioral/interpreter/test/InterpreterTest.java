package gof.behavioral.interpreter.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gof.behavioral.interpreter.pattern.context.Context;
import gof.behavioral.interpreter.pattern.expression.Expression;
import gof.behavioral.interpreter.pattern.terminalexpression.TerminalExpression;

public class InterpreterTest {
	@Test
	public void goodImplementions(){
		String contextString = "7 SUMAR 21 SUMAR 2 RESTAR 5";
		Context c=new Context();
		String[] arrayValues = contextString.split(" ");
		int inte=new TerminalExpression(Integer.valueOf(arrayValues[0])).interpret();
		for (int i = 0; i < arrayValues.length; i++) {
			String s = arrayValues[i];
			if (c.isOperator(s)) {
				Expression exp1=new TerminalExpression(inte);
				Expression exp2=
						new TerminalExpression(Integer.valueOf(arrayValues[i+1]));
				int integ=c.getOperator(s, exp1, exp2).interpret();
				inte=integ;
			}
		}
		assertEquals(inte,25);
	}
}
