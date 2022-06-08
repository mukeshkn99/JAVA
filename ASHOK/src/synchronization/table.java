package synchronization;

public class table {
 synchronized static void print(int a){
	 
	for(int i=1;i<5;i++){
		System.out.println(a*i);
	}
	try{
		Thread.sleep(100);
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}
