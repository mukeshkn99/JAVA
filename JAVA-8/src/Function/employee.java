package Function;

public class employee {
String name;
double salary;
double total;
employee(String name,double salary){
	this.name=name;
	this.salary=salary;
}
@Override
public String toString() {
	return "employee [name=" + name + ", salary=" + salary+"]";
}

}
