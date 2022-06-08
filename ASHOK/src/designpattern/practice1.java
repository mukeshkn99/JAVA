package designpattern;

public class practice1 {
private static practice1 single;
private practice1(){
	
}
public static practice1 getinstance(){
	if(single==null){
		single= new practice1();
	}
	return single;
	
}
public void run(){
	System.out.println("this is singleton");
}
}
