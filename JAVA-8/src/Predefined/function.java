package Predefined;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class function {

	public static void main(String[] args) {
		IntFunction<Integer> f=i->i*i;
		System.out.println(f.apply(5));

	
	ToIntFunction<String> f1=s->s.length();
	System.out.println(f1.applyAsInt("durga"));
	
	
	}
}
