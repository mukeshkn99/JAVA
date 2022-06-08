package cloning;

 public class customer implements Cloneable {

	String name;
	int password;
	public customer(String name,int password){
		this.name=name;
		this.password=password;
	}
	
	public void method(){
		System.out.println("name:"+name+",password:"+password);
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		customer c1=new customer("mukesh",7689);
		customer c2=(customer) c1.clone();
		c1.method();
		c2.method();
		
	}

}
