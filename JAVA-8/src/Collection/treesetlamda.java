package Collection;


import java.util.TreeSet;

public class treesetlamda {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		ts.add(10);
		ts.add(7);
		ts.add(5);
		ts.add(14);
		ts.add(1);
		System.out.println("Before Sorting:" + ts);

	}

}
