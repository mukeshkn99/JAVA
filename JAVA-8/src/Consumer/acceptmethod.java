package Consumer;

import java.util.function.Consumer;

public class acceptmethod {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("hello");
		c.accept("Durgasoft");

	}

}
