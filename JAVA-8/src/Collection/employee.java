package Collection;

public class employee {
int eno;
String name;
public employee(int eno, String name) {
	super();
	this.eno = eno;
	this.name = name;
}
@Override
public String toString() {
	return " [eno=" + eno + ", name=" + name + "]";
}

}
