package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class hashmapdemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("mukesh", 23);
		hm.put("kanesh", 21);
		hm.put("rajesh", 12);
		System.out.println("prints map:"+hm);
		Set s=hm.keySet();
		System.out.println("keys:"+s);
		Collection c=hm.values();
		System.out.println("values:"+s);
		Set se=hm.entrySet();
		System.out.println("entries are"+se);
		
		Iterator i=se.iterator();
		while(i.hasNext()){
			Map.Entry me=(Map.Entry) i.next();
			Object o1=me.getKey();
			Object o2=me.getValue();
			if(o2.equals(23)){
				me.setValue(12);
				System.out.println(me);
			}
		}
		
			System.out.println(hm);	
				TreeMap tm=new TreeMap();
				tm.put("arun", 1010);
				tm.put("kavin", 990);
				tm.put("kalai",725);
				System.out.println(tm);
				
				
				TreeMap tm2=new TreeMap();
				tm2.putAll(tm);
				System.out.println(tm2);
		
		
		
	}

}
