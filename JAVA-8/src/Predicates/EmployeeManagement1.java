package Predicates;

import java.util.ArrayList;

public class EmployeeManagement1 {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		populate(al);
		al.add(new Employee("mukesh","developer",10.000,"trichy"));
        al.add(new Employee("rakesh","engineer",30.000,"china"));
        System.out.println(al);
	}

	private static void populate(ArrayList<Employee> al) {
		al.add(new Employee("hari","teamlead",100.000,"america"));
		
	}
	

}
