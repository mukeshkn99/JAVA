package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialisation {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
try {
	FileInputStream fis=new FileInputStream("file.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	user u=new user("mukesh",1234);
	ois.readObject();
	System.out.println(u.name+":"+u.password);
	ois.close();
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}
