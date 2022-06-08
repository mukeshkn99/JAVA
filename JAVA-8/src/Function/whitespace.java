package Function;

import java.util.function.Function;

public class whitespace {

	public static void main(String[] args) {
	String s1="Durga Software Solution";
	Function<String,Integer> f=s->s.length()-s.replaceAll(" ", "").length();
	System.out.println(f.apply(s1));
	}

}
