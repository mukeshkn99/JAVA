package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ARRAYLIST1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(11);
		al.add(11);
		System.out.println("before:"+al);
		comparatordemo1 cd=new comparatordemo1();
		Collections.sort(al, cd);
		Iterator i=al.iterator();
        while(i.hasNext()){
        	System.out.println(i.next());
        }
        HashSet hs=new HashSet(al);
        System.out.println(hs);
	
	
	TreeSet ts=new TreeSet();
	
	ts.add(12);
	ts.add(1);
	ts.add(13);
	System.out.println(ts);
	
	}
	
	
	
	

}
