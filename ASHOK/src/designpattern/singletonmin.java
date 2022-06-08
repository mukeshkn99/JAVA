package designpattern;

public class singletonmin {

	public static singletonmin single;
	private singletonmin(){
		
	}
	public static singletonmin  getinstanc(){
		if(single==null){
			single=new singletonmin();
		}
		return single;
	}
	public void something(){
		System.out.println("hi");
	}

}
