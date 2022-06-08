package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class collectstream {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Nagarjuna");
		al.add("Venkatesh");
		al.add("Nivin");
		al.add("Mohanlal");
		System.out.println(al);
		List<String> al2=al.stream().filter(s->s.length()>=9).collect(Collectors.toList());
        System.out.println(al2);
        
        List<String> al3=al.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(al3);
	}

}
