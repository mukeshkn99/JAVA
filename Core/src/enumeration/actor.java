package enumeration;

public enum actor {
	
	
AJITH(50),Vijay(60),Yash(40);
public void act(){
	System.out.println("mass entry");
}


	public void act2(){
		System.out.println("dancing in cinemas");
	}

	public void act3(){
		System.out.println("blockbuster film kgf");
	}


int salary;
actor(int salary){
	this.salary=salary;
}
}
