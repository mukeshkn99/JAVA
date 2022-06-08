package Operator;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class unary {

	public static void main(String[] args) {
		UnaryOperator<Integer> o=i->i*i;
		System.out.println(o.apply(10));

		IntUnaryOperator f=i->i*i;
		System.out.println(f.applyAsInt(20));
	}

}
