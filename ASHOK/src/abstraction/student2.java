package abstraction;

public class student2 extends student1 {

	void draw(){
		System.out.println("hi abstract");
	}

	public static void main(String[] args) {
		student2 st2=new student2();
		st2.draw();
	}

}
