package Function;

import java.util.function.Function;

public class Chaining {

	public static void main(String[] args) {
		Function<String,String> f=s->s.toUpperCase();
		System.out.println(f.apply("Aishwaryaabhai"));
		Function<String,String> f2=s->s.substring(0,9);
		System.out.println(f2.apply("Aishwaryaabhai"));
		System.out.println("f1() applied for f2:"+f.andThen(f2).apply("Aishwaryaabhai"));
		System.out.println("f2() applied for f:"+f.compose(f2).apply("Aishwaryaabhai"));
		
	}

}
