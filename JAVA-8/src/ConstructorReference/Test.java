package ConstructorReference;

public class Test {

	public static void main(String[] args) {
		Interf i=sample::new;
		sample s1=i.get();

	}

}
