package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class properties1 {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();

		try {
			FileInputStream fis=new FileInputStream("D://NewJava//ASHOK//src//collection//file.properties");
			p.load(fis);
			String s=p.getProperty("dosai");
			System.out.println(s);
			p.setProperty("vadai", "10");
			FileOutputStream fos=new FileOutputStream("D://NewJava//ASHOK//src//collection//file.properties");
			p.store(fos, "change value");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
