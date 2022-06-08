package Function;

import java.util.function.Function;

public class Stringlength {

	public static void main(String[] args) {
	Function<String,Integer> f=s->s.length();
	System.out.println(f.apply("durga"));
	System.out.println(f.apply("durgasoft"));
	}

}
