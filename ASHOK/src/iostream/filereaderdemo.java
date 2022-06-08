package iostream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filereaderdemo {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\admin\\Desktop\\folder\\1.txt");
        try {
			FileWriter fw=new FileWriter(file);
			fw.write("hi");
			fw.flush();
			fw.close();
			
	      FileReader fr=new FileReader("C:\\Users\\admin\\Desktop\\folder\\1.txt");
		  char[] ch=new char[(int) file.length()];
		   System.out.println(ch.length);
		   fr.read(ch);
		   for(char c:ch){
			   System.out.println(c);
		   }
		  }
	 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
