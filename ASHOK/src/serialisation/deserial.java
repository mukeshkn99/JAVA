package serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class deserial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
			FileInputStream fos;
			try {
				fos = new FileInputStream("C:\\Users\\admin\\Desktop\\folder\\2.txt");
				ObjectInputStream ois=new ObjectInputStream(fos);
				user u=new user("mukesh", 1234);
				ois.readObject();
				System.out.println(u.name+":"+u.password);
				ois.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("i am change object to stream");
		

	}

}
