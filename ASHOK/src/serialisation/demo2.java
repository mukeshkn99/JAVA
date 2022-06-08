package serialisation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class demo2 {

	public static void main(String[] args) throws IOException {
		demo1 d1=new demo1("kavin",123);
		try {
			FileOutputStream fos=new FileOutputStream("D:\\NewJava\\ASHOK\\src\\file1");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(d1);
			oos.flush();
			oos.close();
			System.out.println("iam change");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("not change");
		}
		

	}

}
