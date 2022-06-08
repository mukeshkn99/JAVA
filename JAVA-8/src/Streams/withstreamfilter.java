package Streams;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class withstreamfilter {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(0);
		al.add(10);
		al.add(5);
		al.add(30);
		al.add(20);
		System.out.println(al);
		List<Integer> al2=al.stream().filter(I->I%2==0).collect(Collectors.toList());
       System.out.println(al2);
	}

}
