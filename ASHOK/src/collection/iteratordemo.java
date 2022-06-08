package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iteratordemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("file");
		al.add("java");
		al.add(1);
		al.add("jh");
		System.out.println("before sorting:"+al);
		Iterator i=al.iterator();
		while(i.hasNext()){
			if(i.next().equals(1))
			i.remove();
		}
		System.out.println("after iterating:"+al);
		
		mobile redmi=new mobile("dell",12000,6,128);
		al.add(redmi);
		
		ListIterator li=al.listIterator();
		li.add("hi");
		while(li.hasNext()){
			if(li.next().equals(redmi)){
				li.set("python");
			}
		}
		System.out.println("after listiterator:"+al);
		
		
	}

}
