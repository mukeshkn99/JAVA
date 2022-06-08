package Supplier;

import java.util.function.Supplier;

public class randomname {

	public static void main(String[] args) {
		Supplier<String> s=()->{
			String[] names={"sunny","binny","chinny"};
			int x=(int)(Math.random()*3);
			return names[x];
		};

		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
