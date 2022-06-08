package BiFunction;

import java.util.function.BiFunction;

public class salarycalcemp {

	public static void main(String[] args) {
		BiFunction<employee,timesheet,Double> f=(e,t)->e.dailywage*t.days;
		employee e=new employee(101,"hari",1500.00);
		timesheet t=new timesheet(101,25);
		System.out.println("salary:"+f.apply(e,t));

	}

}
