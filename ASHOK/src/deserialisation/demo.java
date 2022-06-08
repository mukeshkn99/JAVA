package deserialisation;

import java.io.Serializable;

public class demo implements Serializable {
String name;
int rollno;
	public demo(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
	}

}
