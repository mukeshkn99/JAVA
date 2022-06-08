package designpattern;

public class single {
private static single file;
private single(){
	
}
public static single getinstance(){
	if(file==null){
		file=new single();
}
	return file;
	
}
public void something(){
	System.out.println("hi");
}
}
