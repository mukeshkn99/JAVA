package MethodReference;

public class Test {

	public static void m2(){
		System.out.println("method reference implementation");
	}
	public static void main(String[] args) {
		Interf i=Test::m2;
		i.m1();

	}

}
