package cloning;


class file implements Cloneable{
	public String name;
	public file(String name){
		this.name=name;
	}

public void run(){
	System.out.println(name);
}
protected Object clone() throws CloneNotSupportedException{
	return super.clone();
}	
}
public class demo1 implements Cloneable  {
public String name;
public int password;
file File;
public demo1(String name,int password){
	this.name=name;
	this.password=password;
}
public void run(){
	System.out.println(name+""+password);
}
protected Object clone() throws CloneNotSupportedException{
	demo1 s=(demo1) super.clone();
	s.File=(file) s.File.clone();
	return s;
	
}


	public static void main(String[] args) throws CloneNotSupportedException {
		file f=new file("kavi");
		demo1 d1=new demo1("mukesh",1234);
		demo1 d2=(demo1) d1.clone();
		d1.name="kanesh";
		d1.run();
        d2.run();
	}

}
