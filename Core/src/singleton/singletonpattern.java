package singleton;

public class singletonpattern {
private static singletonpattern single;
private singletonpattern(){
	
}
public static singletonpattern getinstance(){
	if(single==null){
		single=new singletonpattern();
	}
	return single;
}
public void something(){
	System.out.println("something went wrong");
}
}
