package Streams;

import java.util.ArrayList;

public class maxmin {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(0);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		System.out.println(al);
		Integer min=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("minimum:"+min);
		Integer max=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("maximum:"+max);
        al.stream().forEach(s->System.out.println(s));
	}

}
