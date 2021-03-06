package BiFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class information {

	public static void main(String[] args) {
		ArrayList<student> al = new ArrayList<>();
		BiFunction<String, Integer, student> f = (name, rollno) -> new student(name, rollno);
		al.add(f.apply("raju", 102));
		al.add(f.apply("ravi", 101));
		for (student s : al) {
			System.out.println("Name:" + s.name);
			System.out.println("RollNo:" + s.rollno);
		}
	}

}
