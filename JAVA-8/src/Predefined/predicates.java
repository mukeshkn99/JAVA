package Predefined;

import java.util.function.IntPredicate;

public class predicates {

	public static void main(String[] args) {
		int[] x={0,2,5,4,10,20};
		IntPredicate p=i->i%2==0;
		for(int x1:x){
			if(p.test(x1)){
			System.out.println(x1);
		}
		}
	}

}
