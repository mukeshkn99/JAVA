package project1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class filefolderdemo {

	public static void main(String[] args) throws IOException {
		/*File f=new File("C:\\Users\\admin\\Desktop\\folder2\\user\\user1.txt");
		
		boolean result=f.exists();
	if(result==false){
		boolean print=f.createNewFile();
	    System.out.println(print);
	}*/
	File f1=new File("C:\\Users\\admin\\Desktop\\folder");
	File[] f2=f1.listFiles();
	for(File s1:f2){
		if(s1.isFile()){
		String str=s1.getName();
			int count=str.lastIndexOf(".");
			String s=str.substring(count+1);
			if(s.equals("txt"))
		System.out.println(str);
	}
	
	}
	}

}
