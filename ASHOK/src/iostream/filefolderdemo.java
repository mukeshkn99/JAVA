package iostream;

import java.io.File;
import java.io.IOException;

import student.object.file;

public class filefolderdemo {

	public static void main(String[] args) throws IOException {
		/*File f=new File("C:\\Users\\admin\\Desktop\\folder\\mukesh\\kavi\\hari");
		boolean b=f.exists();
		System.out.println("folder present:"+b);
		if(b==false){
			boolean b1=f.mkdirs();
			System.out.println("subfolder present:"+b1);		
		}
		
		File f1=new File("C:\\Users\\admin\\Desktop\\folder\\1.txt");
	boolean b2=f1.exists();
	if(b2==false){
		try {
			boolean present=f1.createNewFile();
			System.out.println("file present:"+present);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f2=new File("C:\\Users\\admin\\Desktop\\folder\\1.txt");
		f2.createNewFile();
		File f3=new File("C:\\Users\\admin\\Desktop\\folder\\2.txt");
		boolean b4=f2.renameTo(f3);
		System.out.println(b4);
		System.out.println(f3.getName());
		
		File f4=new File("C:\\Users\\admin\\Desktop\\folder\\1.txt");
		f4.delete();*/
	
		/*File f5=new File("C:\\Users\\admin\\Desktop\\folder");
		String[] listfilefolder=f5.list();
		for(String s:listfilefolder){
			System.out.println(s);
		}*/
		
		/*File f5=new File("C:\\Users\\admin\\Desktop\\folder");
		File[] f=f5.listFiles();
		for(File s:f){
			if(s.isDirectory())
			System.out.println(s);
		}*/
		
		File f5=new File("C:\\Users\\admin\\Desktop\\folder");
		File[] f=f5.listFiles();
		for(File s:f){
			if(s.isFile()){
			String s1=s.getName();
		     int i=s1.lastIndexOf(".");
		     String s2=s1.substring(i+1);
		    if(s2.equals("txt"))
		    System.out.println(s1);
	}
		}
	}

}