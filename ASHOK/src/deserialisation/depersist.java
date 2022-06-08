package deserialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class depersist {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try {
			FileInputStream fin=new FileInputStream("file.txt");
			ObjectInputStream oin=new ObjectInputStream(fin);
		
			demo de=new demo("Mukesh",154);
			oin.readObject();
			System.out.println(de.rollno+""+de.name);
			oin.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("stream to change for object");
		}

	}

}
