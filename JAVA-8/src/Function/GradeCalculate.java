package Function;

import java.util.ArrayList;
import java.util.function.Function;

public class GradeCalculate {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		populate(al);
		Function<Student,String> f=s->{
			int marks=s.marks;
			if(marks>=80){
				return "A[Ditinction]";
			}
			else if(marks>=60){
				return "B[First Class]";
			}
			else if(marks>=35){
				return "C[Third Class]";
			}
			else{
				return "E[Failed]";
			}
		};

		for(Student s1:al){
			System.out.println("name:"+s1.name);
			System.out.println("marks:"+s1.marks);
			System.out.println("Grade:"+f.apply(s1));
		}
	}

	private static void populate(ArrayList<Student> al) {
		al.add(new Student("sunil",85));
		al.add(new Student("binny",65));
		al.add(new Student("chinny",40));
		al.add(new Student("sunny",30));
	}

}
