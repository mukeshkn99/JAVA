package Exception;

public class throwdemo2 {
public static void main(String[] args){
	try{
		throwsdemo1 td1=new throwsdemo1();
		td1.method(2, 0);
		
	}
	catch(Exception e){
		System.out.println("exception accured");
	}
}
}
