package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sorted {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(0);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		System.out.println(al);
		List<Integer> l=al.stream().sorted().collect(Collectors.toList());
		System.out.println("natural sorting:"+l);
		List<Integer> l2=al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
	   System.out.println("customized sorting order:"+l2);
	}

}
