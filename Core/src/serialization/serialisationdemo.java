package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialisationdemo {
public static void main(String[] args) throws IOException{
	user u=new user("mukesh",1234);
	
	try {
		FileOutputStream fis=new FileOutputStream("file.txt");
		ObjectOutputStream ois=new ObjectOutputStream(fis);
		ois.writeObject(u);
		ois.flush();
		ois.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
