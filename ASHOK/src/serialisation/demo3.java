package serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class demo3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	try {
		FileInputStream fis=new FileInputStream("D:\\NewJava\\ASHOK\\src\\file1");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		demo1 d1=(demo1) ois.readObject();
		ois.close();
		System.out.println(d1.name+""+d1.password);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
