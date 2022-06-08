package collection;

import java.util.Deque;
import java.util.PriorityQueue;

public class priorityqueue {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
        pq.add("kalai");
        pq.add("ravi");
        pq.add("alai");
        pq.add("kavi");
        System.out.println("queue elements:"+pq);
        System.out.println(pq.element());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.offer("arun"));
        System.out.println(pq);
        
        
        
        
        
        
        
        
	}

}
