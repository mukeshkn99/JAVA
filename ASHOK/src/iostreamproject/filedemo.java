package iostreamproject;

import java.io.File;
import java.io.IOException;

public class filedemo {

	public static void main(String[] args) throws IOException {
	/*	File f=new File("C:\\Users\\admin\\Desktop\\folder\\subfolder");
        boolean b=f.exists();
if(b==false){
 boolean result=f.mkdirs();
 System.out.println(result);
}
File f1=new File("C:\\Users\\admin\\Desktop\\folder\\subfolder\\file.txt");
f1.createNewFile();
	File f2=new File("C:\\Users\\admin\\Desktop\\folder\\subfolder\\file1.txt");
	f1.renameTo(f2);
	System.out.println(f2.getName());

	File f3=new File("C:\\Users\\admin\\Documents");
	String[] s=f3.list();
	System.out.println("file folder:");
	for(String s1:s){
		System.out.println(s1);
	}*/
	File f4=new File("C:\\Users\\admin\\Documents");
	File[] f=f4.listFiles();
	System.out.println("file:");
	for(File f5:f){
		if(f5.isFile()){
		String s2=f5.getName();
		int dot=s2.lastIndexOf(".");
	     String extension=s2.substring(dot+1);
	     if(extension.equals("html"))
	    	 if(s2.length()>1)
	     System.out.println(s2+"size"+s2.length());
	}
	}
	File f6=new File("C:\\Users\\admin\\Documents");
	File[] f7=f6.listFiles();
	System.out.println("folder:");
	for(File f8:f7){
		if(f8.isDirectory())
		System.out.println(f8);
	}
	
	}

	}

