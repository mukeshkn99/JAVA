package collection;

import java.util.ArrayList;
import java.util.List;

public class arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		al.add(5);
		al.add(2);
		al.add("hi");
		al.add("hlo");
		
		System.out.println(al);
		System.out.println(al.add(90));
		System.out.println(al.contains(5));
		System.out.println(al.get(1));
		System.out.println(al.indexOf(2));
		System.out.println(al);
		System.out.println(al.lastIndexOf("hlo"));
		System.out.println(al.remove(1));
		System.out.println(al);
		System.out.println(al.set(0, "mukesh"));
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al);
	
	ArrayList al2=new ArrayList();
	al2.addAll(al);
	System.out.println(al2);
	
	List al3=al2.subList(0, 2);
	System.out.println(al3);
	
	al3.addAll(0,al);;
	System.out.println(al3);
	
	
	
	}

}
