package collection;

public enum Actors {
	
AJITH(50)
{
public void act(){
	System.out.println("mass entry in movie ");
}
},
VIJAY(40){
	
},
SURYA(30){
	
};
private int salary;
Actors(int salary){
	this.setSalary(salary);
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}
