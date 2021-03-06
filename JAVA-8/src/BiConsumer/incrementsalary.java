package BiConsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class incrementsalary {

	public static void main(String[] args) {
		BiFunction<String,Double,employee> f=(name,salary)->new employee(name,salary);
		ArrayList<employee> al=new ArrayList<>();
		al.add(new employee("hari",10000.00));
		al.add(new employee("ravi",6000.00));
		
		BiConsumer<employee,Double> c=(emp,d)->emp.salary=emp.salary+d;
        for(employee e:al){
        	c.accept(e,500.00);
        }
        for(employee e:al){
        	System.out.println(e.name);
        	System.out.println(e.salary);
        }
	}

}
