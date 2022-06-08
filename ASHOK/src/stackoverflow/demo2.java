package stackoverflow;

public class demo2 {
 static int number=1;
 
	static void print(){
		try{
		if(number<1000000){
			System.out.println("hi");
			number++;
			print();
		}
	}
	catch(Exception e){
		e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		print();
System.out.println("stop...");
	}

}
