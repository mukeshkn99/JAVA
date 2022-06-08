package multithreading;

public class childthread1 extends Thread {
public void run(){
	for(int i=0;i<5;i++){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("got interrupted");
		}
		System.out.println("childthread"+i);
	}
}
}
