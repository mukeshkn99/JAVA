package cloning;



public class user implements Cloneable{
	String name;
	int password;
public user(String name,int password){
	this.name=name;
	this.password=password;
}

protected Object clone() throws CloneNotSupportedException{
	return super.clone();
	
}
public void run(){
	System.out.println(name+password);
}

	public static void main(String[] args) throws CloneNotSupportedException {
		user u1=new user("mukesh",1234);
		u1.run();
		user u2=(user) u1.clone();
		u2.run();
		

	}

}
