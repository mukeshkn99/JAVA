package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class practice1 {
	public static void main(String[] args) {
		mobile redmi = new mobile("y1", 12000, 6, 128);
		mobile oppo = new mobile("a31", 20000, 8, 256);
		mobile honor = new mobile("a1", 12000, 4, 64);
		HashMap hm = new HashMap();
		hm.put(redmi, 1);
		hm.put(oppo, 2);
		hm.put(honor, 3);
		System.out.println(hm);
		Set s = hm.keySet();
		System.out.println("keys are:" + s);
		Collection c = hm.values();
		System.out.println("values are:" + c);
		Set es = hm.entrySet();
		System.out.println(es);
Iterator i=	es.iterator();

	while(i.hasNext()){
		Map.Entry me=(Map.Entry)i.next();
		
	   mobile o1=(mobile)me.getKey();
	   Object o2=me.getValue();
	   if(o2.equals(2)){
		   o1.price=18000;
	   }
	   System.out.println(me);
	}
	
	}
}