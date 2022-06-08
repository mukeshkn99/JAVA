package iostream;

import java.io.File;
import java.io.IOException;

public class practice1 {

	public static void main(String[] args) {
/*		File f=new File("C://Users//admin//Desktop//newfolder//folder1");
		boolean result=f.exists();
System.out.println(result);
if(result==false){
	boolean print=f.mkdirs();
	System.out.println("folder present:"+print);
}
File f1=new File("C://Users//admin//Desktop//newfolder//folder1//file.txt");
boolean condition=f1.exists();
if(condition==false){
	try {
		boolean printfile=f1.createNewFile();
		System.out.println("file is:"+printfile);
	} catch (IOException e) {
		System.out.println("not print");
	}
}

File f2=new File("C://Users//admin//Desktop//newfolder//file.txt");
try {
	f2.createNewFile();
	File f3=new File("C://Users//admin//Desktop//newfolder//file1.txt");
	boolean result3=f2.renameTo(f3);
	System.out.println(result3);
	System.out.println(f2.getName());
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


File f3=new File("C://Users//admin//Documents");
String[] filefolder=f3.list();
for(String s:filefolder){
	System.out.println(s);
}


File f4=new File("C://Users//admin//Documents");
File[] files=f4.listFiles();
for(File f:files){
	if(f.isFile()){
		System.out.println(f);
	}
}*/

File f5=new File("C:\\Users\\admin\\Documents");
File[] filefolderarray=f5.listFiles();
for(File f2: filefolderarray){
	if(f2.isFile()){
	String name=f2.getName();
	int L=name.lastIndexOf(".");
	String condition=name.substring(L+1);
	if(condition.equals("html"))
		if(name.length()>6)
		System.out.println(name+"->"+name.length());
	 
}

}

	}
	

}
