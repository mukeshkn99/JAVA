package Predicates;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		Predicate<Integer> p=I->I>10;
		System.out.println(p.test(100));
		System.out.println(p.test(5));

	}

}
