package MethodReference;

public class ThreadDemo {
public void m1(){
	for(int i=0;i<10;i++){
	System.out.println("Child Thread Implementation");
	}
}
	public static void main(String[] args) {
		ThreadDemo t=new ThreadDemo();
	Runnable r=t::m1;
	Thread t1=new Thread(r);
	t1.start();
	for(int i=0;i<10;i++){
		System.out.println("Main Thread Implementation");
	}

	}

}
