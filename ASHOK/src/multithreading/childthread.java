package multithreading;

public class childthread extends Thread {
public void run(){
	for(int i=1;i<=5;i++){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("wake up");
		}
	System.out.println("child thread"+i);
}
}
}
