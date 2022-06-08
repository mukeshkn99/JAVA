package Predicates;

import java.util.function.Predicate;

public class StartsWithK {

	public static void main(String[] args) {
		String[] names={"sunny","Katrina","Kareena","chinni","malliga"};
		Predicate<String> startswithk=s->s.charAt(0)=='K';
		System.out.println("given names start with k are:");
		for(String s2:names){
			if(startswithk.test(s2)){
				System.out.println(s2);
			}
		}

	}

}
