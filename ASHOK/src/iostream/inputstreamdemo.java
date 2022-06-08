package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class inputstreamdemo {

	public static void main(String[] args) {
		try {
			InputStream is=new FileInputStream("C:\\Users\\admin\\Pictures\\img.jpg");
			OutputStream os=new FileOutputStream("C:\\Users\\admin\\Pictures\\im2.jpg");
			
			int print=is.read();
			while(print!=-1){
				os.write(print);
				print=is.read();
			}
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
