package collection;

import java.util.Stack;

public class stackdemo {

	public static void main(String[] args) {
		Stack s=new Stack();
        s.add("file");
        s.add("java");
        s.add("python");
        s.add("php");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.push(".net"));
        
        System.out.println(s);
        
	}

}
