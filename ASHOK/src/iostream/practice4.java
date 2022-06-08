package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class practice4 {

	public static void main(String[] args) throws IOException {
		try {
			InputStream is=new FileInputStream("C://Users//admin//Pictures//img.jpg");
			OutputStream os=new FileOutputStream("C://Users//admin//Pictures//img1.jpg");
			int l=is.read();
			while(l!=-1){
				os.write(l);
				l=is.read();
				
			}
			System.out.println("image stored successfully");
			os.flush();
			
		} 
		
		
		catch (FileNotFoundException e) {
			System.out.println("not stored image");
		}
		

	}

}
