package Predicates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class collection {

	public static void main(String[] args) {
		Predicate<Collection> p=c->c.isEmpty();
		ArrayList al=new ArrayList<>();
		al.add("ab");
		System.out.println(p.test(al));
		ArrayList al2=new ArrayList<>();
	    System.out.println(p.test(al2));

	}

}
