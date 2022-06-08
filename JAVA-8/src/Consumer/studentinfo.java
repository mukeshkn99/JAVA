package Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class studentinfo {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
        populate(al);
        
        Predicate<Student> p=s->s.marks>=20;
        Function<Student,String> f=s->{
        	int marks=s.marks;
        	if(marks>=80){
        		return "A[Distinction]";
        	}
        	else if(marks>=60){
        		return "B[first class]";
        	}
        	else if(marks>=40){
        		return "c[Second class]";
        	}
        	else{
        		return "D[Third Class]";
        	}
        };
        Consumer<Student> c=s->{
        	System.out.println("Name:"+s.name);
        	System.out.println("Marks:"+s.marks);
        	System.out.println("Grade:"+f.apply(s));
        };
        for(Student s:al){
        	if(p.test(s)){
        		c.accept(s);
        	}
        }
	}

	private static void populate(ArrayList<Student> al) {
		al.add(new Student("sunil",80));
		al.add(new Student("chinny",65));
		al.add(new Student("sunny",70));
		al.add(new Student("kinny",50));
		al.add(new Student("binny",35));
		
	}

}
