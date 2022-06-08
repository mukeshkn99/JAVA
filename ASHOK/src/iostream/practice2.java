package iostream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class practice2 {

	public static void main(String[] args) {
		File f=new File("C://Users//admin//Desktop//folder//1.txt");
try {
	FileWriter fw=new FileWriter(f);
	fw.write("hi");
	fw.write("how r u");
	fw.flush();
	fw.close();
	
	
	FileReader fr=new FileReader(f);
	int l=fr.read();
	char[] ch=new char[(int) f.length()];
	System.out.println(ch.length);
	while(l!=-1){
		System.out.println((char)l);
		l=fr.read();
	}
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
