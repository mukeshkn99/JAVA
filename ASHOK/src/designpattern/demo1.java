package designpattern;

public class demo1 {
private static demo1 single;
private demo1(){
	
}
public static demo1  getinstance(){
	if(single==null){
		single=new demo1();
	}
	return single;
	
}
public void something(){
	System.out.println("hi");
}
}
