package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesdemo {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		
        FileInputStream fis=new FileInputStream("D://NewJava//ASHOK//src//collection//text.properties");
        p.load(fis);
        System.out.println(p);
       String s=p.getProperty("mukesh");
       System.out.println(s);
       p.setProperty("mukesh", "438");
       FileOutputStream fos=new FileOutputStream("D://NewJava//ASHOK//src//collection//text.properties");
	    p.store(fos,"update");
	}

}
