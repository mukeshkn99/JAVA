package multithreading;

public class threadcaller {

	public static void main(String[] args) throws InterruptedException {
		childthread ct=new childthread();
		System.out.println(ct.getState());
		ct.start();
		//ct.interrupt();
		System.out.println(ct.getState());
		for(int i=1;i<=5;i++){
			
			System.out.println("main thread"+i);
		}

	}

}
