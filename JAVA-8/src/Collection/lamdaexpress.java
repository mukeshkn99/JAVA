package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class lamdaexpress {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(7);
		al.add(5);
		al.add(14);
		al.add(1);
		System.out.println("Before Sorting:" + al);
		Collections.sort(al,(I1,I2)->I1>I2?-1:I1<I2?1:0);
		System.out.println("After Sorting:"+al);

	}

}
