package program;

import java.util.Random;

public class randomnumberdemo {

	public static void main(String[] args) {
		Random r=new Random();
		int a=20+r.nextInt(100);
		System.out.println("Random numbers:"+a);

	}

}
