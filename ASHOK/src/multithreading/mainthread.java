package multithreading;

public class mainthread {
	public static void main(String[] args) throws InterruptedException{
childthread1 ct1=new childthread1();
ct1.start();
ct1.interrupt();
for(int i=0;i<5;i++){
	System.out.println("mainthread:"+i);
}
}
}