package Enumeration;

public enum user {
HARISH("user",1234),

KALAI("kalai",879),
KAVI("kavi",3647);

	private String name;
	private int password;
user(String name,int password){
	this.name=name;
	this.password=password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public void act1(){
	System.out.println("i am try this it job");
}
public void act2(){
	System.out.println("i am try this electronics job");
}
public void act3(){
	System.out.println("i am try this electrical job");
}
}
