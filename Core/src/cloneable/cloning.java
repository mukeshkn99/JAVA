package cloneable;

public class cloning implements Cloneable {
String name;
int password;
public cloning(String name,int password){
	this.name=name;
	this.password=password;
}

protected Object clone() throws CloneNotSupportedException{
	return super.clone();
	
}
public void run(){
	System.out.println(this.name+this.password);
}
	public static void main(String[] args) throws CloneNotSupportedException {
		cloning c=new cloning("mukesh",1234);
		cloning c2=(cloning) c.clone();
		c2.run();
		

	}

}
