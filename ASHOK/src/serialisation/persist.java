package serialisation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class persist {

	public static void main(String[] args) throws IOException {
		serialisationdemo sd=new serialisationdemo(890);
		
		try {
			FileOutputStream fos=new FileOutputStream("file.txt");
			ObjectOutputStream oin=new ObjectOutputStream(fos);
			oin.writeObject(sd);
			oin.flush();
			oin.close();
			System.out.println("i am change for stream");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("i am change for stream");
		}
	}

}
