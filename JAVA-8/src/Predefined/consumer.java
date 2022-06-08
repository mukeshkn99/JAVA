package Predefined;

import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;

public class consumer {

	public static void main(String[] args) {
		ArrayList<employee> al=new ArrayList<>();
		populate(al);
		
		ObjDoubleConsumer<employee> c=(e,d)->e.salary=e.salary+d;
        for(employee e:al){
        	c.accept(e, 500);
        }
        for(employee e:al){
        	System.out.println("name:"+e.name);
        	System.out.println("salaray:"+e.salary);
        	System.out.println();
        }
	}

	private static void populate(ArrayList<employee> al) {
		al.add(new employee("chinny",1000));
		al.add(new employee("binny",4000));
		al.add(new employee("kinny",5000));
		al.add(new employee("bunny",2000));
		al.add(new employee("tinny",6000));
		
	}

}
