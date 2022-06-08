package Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class printmovie {

	public static void main(String[] args) {
		ArrayList<movie> al=new ArrayList<>();
		populate(al);
		
		Consumer<movie> c=m->{
			System.out.println("Movie Name:"+m.name);
			System.out.println("Hero:"+m.hero);
			System.out.println("Heroine:"+m.heroine);
			System.out.println();
		};
		for(movie m:al){
			c.accept(m);
		}

	}

	private static void populate(ArrayList<movie> al) {
		al.add(new movie("Vishwasam","AJITH","Hasan"));
		al.add(new movie("kgf","yash","shetty"));
		al.add(new movie("mersal","vijay","samantha"));
		
	}

}
