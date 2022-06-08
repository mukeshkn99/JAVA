package Predicates;

import java.util.function.Predicate;

public class Joining {

	public static void main(String[] args) {
		int[] x={0,5,10,15,20,30};
		Predicate<Integer> p1=I->I>10;
		Predicate<Integer> p2=I->I%2==0;
		System.out.println("given number is greaterthan 10 are:");
		m1(p1,x);
		System.out.println("even numbers are:");
		m1(p2,x);
		System.out.println("given number is not greater than are:");
		m1(p1.negate(),x);
		System.out.println("number is even and greater than are:");
		m1(p1.and(p2),x);
		System.out.println("number is even or greater than are:");
		m1(p1.or(p2),x);
	}
	public static void m1(Predicate<Integer> p,int[] x ){
		for(int x1:x){
			if(p.test(x1)){
				System.out.println(x1);
			}
		}
	}

}
