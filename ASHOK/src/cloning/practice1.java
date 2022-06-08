package cloning;

public class practice1 implements Cloneable{
	
	String name;
	int password;
	public practice1(String name,int password){
		this.name=name;
		this.password=password;
	}
	public void run(){
		System.out.println("name:"+name+"password:"+password);
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
public static void main(String[] args) throws CloneNotSupportedException{
	practice1 p1=new practice1("mukesh",1234);
	practice1 p2=(practice1) p1.clone();
	p1.run();
	p2.run();
}
}
