package deserialisation;

import java.io.Serializable;

public class practice1 implements Serializable{
String name;
int password;
public practice1(String name,int password){
	this.name=name;
	this.password=password;
}
}
