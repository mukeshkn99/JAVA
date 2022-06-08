package Streams;

import java.util.ArrayList;

public class countstream {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Nagarjuna");
		al.add("Venkatesh");
		al.add("Nivin");
		al.add("Mohanlal");
		System.out.println(al);
		long count=al.stream().filter(s->s.length()>=9).count();
		System.out.println("whos >=9 is required:"+count);

	}

}
