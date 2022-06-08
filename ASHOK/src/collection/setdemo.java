package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class setdemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		
		LinkedList ls=new LinkedList();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(6);
		ls.add(8);
		ls.add(4);
		ls.add(3);
		System.out.println("print list:"+ls);
		
		
		TreeSet ts1=new TreeSet(ls);
		System.out.println("dublicate remove:"+ts1);
		
		
		
		
		HashSet hs=new HashSet();
		hs.add(12);
		hs.add("file");
		hs.add(4);
		hs.add("java");
		hs.add(4);
		System.out.println("hashset is maintained:"+hs);
    
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(12);
		lhs.add("file");
		lhs.add(4);
		lhs.add("java");
		lhs.add(4);
		System.out.println("likedhashset is maintained:"+lhs);
		
		
		TreeSet ts=new TreeSet();
		ts.add(12);
		ts.add(4);
	    ts.add(3);
		ts.add(4);
		
		
		System.out.println("treeset is maintained:"+ts);
		
		
	}

}
