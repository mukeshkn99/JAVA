package synchronization;

public class caller {

	public static void main(String[] args) {
		table t=new table();
		mythread1 m1=new mythread1(t);
		mythread2 m2=new mythread2(t);
		 m1.start();
		m2.start();
	}

}
