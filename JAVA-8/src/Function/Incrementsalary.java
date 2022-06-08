package Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Incrementsalary {

	public static void main(String[] args) {
		ArrayList<employee> al=new ArrayList<>();
		populate(al);
		System.out.println("before salary");
		Predicate<employee> p=e->e.salary<3500;
		Function<employee,employee> f=e->{
			e.salary=e.salary+477;
			return e;
		};
ArrayList<employee> al2=new ArrayList<>();
for(employee e1:al){
	if(p.test(e1)){
		al2.add(f.apply(e1));
	}
}
System.out.println("after increment salary");
System.out.println(al);
System.out.println("salary increment person there");
System.out.println(al2);
	}

	private static void populate(ArrayList<employee> al) {
		al.add(new employee("chinny",1000));
		al.add(new employee("soniya",2000));
		al.add(new employee("binny",5000));
		al.add(new employee("kajol",3000));
		al.add(new employee("tinny",10000));
		
	}

}
