package Predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeManagement2 {

	public static void main(String[] args) {
	ArrayList<Employee> al=new ArrayList<>();
	populate(al);
	
	Predicate<Employee> p1=emp->emp.designation.equals("manager");
	display(p1,al);
	
	Predicate<Employee> p2=emp->emp.city.equals("bangalore");
	display(p2,al);
	System.out.println("20000 lessthan are there:");
	Predicate<Employee> p3=emp->emp.salary<20000;
	display(p3,al);
	
	System.out.println("all employees managers and bangaloroes are there:");
	display(p1.and(p2),al);
	
	Predicate<Employee> p5=Predicate.isEqual(new Employee("kannan","developer",20000.00,"madurai"));
	
	Employee e1=new Employee("kannan","developer",20000.00,"madurai");
	Employee e2=new Employee("kalai","engineer",10000,"mumbai");
	System.out.println(p5.test(e1));
	System.out.println(p5.test(e2));
	System.out.println("employee is manager or bangalore are there:");
	display(p1.or(p2),al);
	
	System.out.println("employees in not manager are there:");
	display(p1.negate(),al);
	}

	private static void display(Predicate<Employee> p1, ArrayList<Employee> al) {
		for(Employee e:al){
			if(p1.test(e)){
				System.out.println(e);
			}
		}
		
	}

	private static void populate(ArrayList<Employee> al) {
		//al.add(new Employee("kannan","developer",20000.00,"madurai"));
		al.add(new Employee("kanesh","manager",10000.00,"chennai"));
		al.add(new Employee("ramesh","manager",20000.00,"bangalore"));
		al.add(new Employee("shrishail","ceo",100000.00,"mumbai"));
	}

}
