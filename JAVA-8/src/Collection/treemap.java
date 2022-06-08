package Collection;

import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		tm.put(101, "customer");
		tm.put(103, "manager");
		tm.put(102, "client");
		tm.put(104, "user");
	System.out.println(tm);
	}

}
