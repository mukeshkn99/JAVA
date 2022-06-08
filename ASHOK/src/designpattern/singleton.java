package designpattern;


public class singleton {
private static singleton single;
	private singleton(){
		
	}
	
	public static singleton getinstance(){
		if(single==null){
			single=new singleton();
		}
		return single;
	}
	public void something(){
		System.out.println("hi");
	}
}
