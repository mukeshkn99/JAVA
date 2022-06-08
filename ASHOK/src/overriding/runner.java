package overriding;

public class runner {

	public static void main(String[] args) {
		demo4 d4=(demo4) new demo3();
		d4.demo1("fgdg", 8);
		d4.demo1("fhf",4);
demo3 d5=new demo4();
		
		
	}

}
