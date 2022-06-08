package serialization;

import java.io.Serializable;

public class user implements Serializable {
String name;
int password;
public user(String name, int password) {
	super();
	this.name = name;
	this.password = password;
}

}
