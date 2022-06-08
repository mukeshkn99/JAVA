package collection;

import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class practice4 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add("shruthihasan");
		pq.add("thamana");
		pq.add("nayanthara");
		System.out.println(pq.element());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.contains("nayanthara"));
		System.out.println(pq.offer("rashmika"));

		Stack s=new Stack();
		s.add("file");
		s.add("java");
		s.add("python");
		s.add("c");
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.push(".net"));
		System.out.println(s.empty());
		
		
		Vector v=new Vector(s);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v);
		System.out.println(v);
	}

}
