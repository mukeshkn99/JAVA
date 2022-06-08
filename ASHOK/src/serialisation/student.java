package serialisation;

import java.io.Serializable;

public class student implements Serializable{
String username;
int password;
public student(String username,int password){
	this.username=username;
	this.password=password;
}
}
