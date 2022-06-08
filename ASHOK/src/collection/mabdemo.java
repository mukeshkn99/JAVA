package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mabdemo {

	public static void main(String[] args) {

		mobile m=new mobile("y1",12000,4,64);
		mobile m1=new mobile("a31",15000,6,128);
		mobile m2=new mobile("y4",21000,8,256);
		
		
		HashMap hm=new HashMap();
		hm.put(1,m);
		hm.put(2,m1);
		hm.put(3,m2);
		
	    Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()){
			Map.Entry me=(Map.Entry)i.next();
			Object o1=me.getKey();
	
			mobile mo=(mobile)me.getValue();
			if(o1.equals(2)){
				mo.gb=8;
			}
			
		}
		System.out.println(hm);
	}

}
