package serialisation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class practice2{
	public static void main(String[] args) throws IOException {
		practice1 p1 = new practice1("mukesh", 9873);

		try {
			FileOutputStream fos = new FileOutputStream("D://NewJava//ASHOK//src//file1.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(p1);
			oos.flush();
			oos.close();
			System.out.println("change for object into stream");
			
		} catch (FileNotFoundException e) {
			System.out.println("can not change object into stream");
		}
	}
}
