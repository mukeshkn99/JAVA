package Predicates;

import java.util.function.Predicate;

public class Validsoftare {

	public static void main(String[] args) {
		softwareengineer[] employee={new softwareengineer("sunny",50,false),
				new softwareengineer("chinny",40,true),
		        new softwareengineer("bunny",25,true),
		};
		
Predicate<softwareengineer> p=se->se.age>30 && se.ishavingGF==true;
System.out.println("valid person are there:");
for(softwareengineer s:employee){
	if(p.test(s)){
		System.out.println(s);
	}
}
	}

}
