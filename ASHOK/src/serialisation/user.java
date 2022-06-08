package serialisation;

import java.io.Serializable;

public class user implements Serializable {
	String name;
	int password;
user(String name,int password){
	this.name=name;
	this.password=password;
}
}
