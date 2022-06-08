package cloning;

public class student implements Cloneable {

  int id;
String name;

	public student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void run(){
	
		System.out.println(name);
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public void display(){
		System.out.println(id);
		run();
	}
	

	public static void main(String[] args) throws CloneNotSupportedException {
		student st=new student(112,"mukesh");
		
		student st2=(student) st.clone();
		st.name="kavi";
		st.run();
		st2.display();
	}

}
