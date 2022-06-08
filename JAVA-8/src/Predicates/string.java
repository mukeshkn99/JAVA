package Predicates;

import java.util.function.Predicate;

public class string {

	public static void main(String[] args) {
		Predicate<String> p=s->s.length()>5;
		System.out.println(p.test("abcdef"));
		System.out.println(p.test("abc"));

	}

}
