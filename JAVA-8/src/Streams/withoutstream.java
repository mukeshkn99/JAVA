package Streams;

import java.util.ArrayList;

public class withoutstream {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(0);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		System.out.println(al);
		ArrayList<Integer> al2=new ArrayList<>();
		for(Integer i:al2){
			if(i%2==0){
			al2.add(i);
			}
			
		}
		System.out.println("even are there:"+al2);

	}

}
