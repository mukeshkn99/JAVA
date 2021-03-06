package Function;

import java.util.ArrayList;
import java.util.function.Function;

public class salarycalc {

	public static void main(String[] args) {
		ArrayList<employee> al=new ArrayList<>();
		populate(al);
        System.out.println(al);
		Function<ArrayList<employee>,Double> f=l1->{
			double total=0;
			for(employee e:l1){
				double salary=e.salary;
				total=total+salary;
			}
			return total;
		};
		System.out.println("Total salary:"+f.apply(al));
	}

	private static void populate(ArrayList<employee> al) {
		al.add(new employee("chinny",10000));
		al.add(new employee("soniya",20000));
		al.add(new employee("binny",5000));
		al.add(new employee("kajol",3000));
		al.add(new employee("tinny",10000));
	}

}
