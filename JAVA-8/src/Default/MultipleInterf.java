package Default;

public class MultipleInterf implements Left,Right{

	public static void main(String[] args) {
		MultipleInterf m=new MultipleInterf();
		m.m1();
	}

	@Override
	public void m1() {
		Left.super.m1();
	}

}
