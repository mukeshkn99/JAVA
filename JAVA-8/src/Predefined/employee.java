package Predefined;

public class employee {
String name;
double salary;
employee(String name,double salary){
	this.name=name;
	this.salary=salary;
}
@Override
public String toString() {
	return "employee [name=" + name + ", salary=" + salary+"]";
}

}
