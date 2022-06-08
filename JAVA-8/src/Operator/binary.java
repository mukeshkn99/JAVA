package Operator;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class binary {

	public static void main(String[] args) {
		BinaryOperator<String> o=(s1,s2)->s1+s2;
		System.out.println(o.apply("durga","soft"));

		IntBinaryOperator f=(i1,i2)->i1+i2;
		System.out.println(f.applyAsInt(10,20));
	}

}
