package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList al=new LinkedList();
		al.add(1);
		al.add(2);
		al.add("hi");
		al.add("hlo");
		
		System.out.println(al);
		
		al.addFirst("aplly");
        al.offerFirst("king");
        System.out.println(al);
        al.poll();
        System.out.println(al);
        al.removeFirst();
        System.out.println(al);
	
	}

}
