package stackoverflow;

public class demo4 {

	static int number=1;
	static void printvalue(){
		try{
		while(number<10000000){
			System.out.println("jio");
			number++;
			printvalue();
		}
	}
	
	catch(Exception e){
		e.printStackTrace();
	}
	}
	
	
	
	public static void main(String[] args) {
		printvalue();
		System.out.println("bye...");

	}

}
