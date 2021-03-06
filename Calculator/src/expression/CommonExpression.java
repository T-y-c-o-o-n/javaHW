package expression;

import java.util.EnumSet;
import java.util.List;

public interface CommonExpression extends Expression, TripleExpression, DoubleExpression {
	public String toString();
	public String toMiniString();
	String checkString(EnumSet<Oper> allowed);
	public int evaluate(int x, int y, int z);
	public double evaluate(double x);
	public int getPriority();
	public Oper getOper();
}