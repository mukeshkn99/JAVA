package deserialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class practice2 {
public static void main(String[] args) throws IOException, ClassNotFoundException{
	try {
		FileInputStream fis=new FileInputStream("D://NewJava//ASHOK//src//file1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		practice1 p1=new practice1("mukesh",998);
		ois.readObject();
		System.out.println(p1.name+p1.password);
		ois.close();		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
