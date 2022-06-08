package serialisation;

import java.io.ObjectInputStream;
import java.io.Serializable;

public class demo1 implements Serializable{
public String name;
public int password;
public demo1(String name,int password){
	this.name=name;
	this.password=password;
}

}
