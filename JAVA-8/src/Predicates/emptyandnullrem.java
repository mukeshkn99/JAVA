package Predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class emptyandnullrem {

	public static void main(String[] args) {
		String[] names={"raju","",null,"ravi","","durga",null};
		Predicate<String> p=s->s!=null && s.length()!=0;
		ArrayList<String> al=new ArrayList<>();
		for(String s:names){
			if(p.test(s)){
				al.add(s);
			}
		}System.out.println("values ar there");
		System.out.println(al);

	}

}
