package Function;

import java.util.function.Function;

public class identitystatic {

	public static void main(String[] args) {
		Function<String,String> f=Function.identity();
		String apply = f.apply("durga");
		System.out.println(apply);

	}

}
