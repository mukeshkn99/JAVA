package Streams;

import java.util.ArrayList;

public class toarray {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(0);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		System.out.println(al);
		Integer[] ar=al.stream().toArray(Integer[]::new);
       for(Integer x:ar){
    	   System.out.println(x);
       }
	}

}
