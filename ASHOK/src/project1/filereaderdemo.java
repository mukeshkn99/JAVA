package project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class filereaderdemo {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\admin\\Desktop\\folder2\\user\\user1.txt");
		try {
			FileWriter fw=new FileWriter(f,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("hi");
			bw.newLine();
			bw.write("mukesh");
			bw.flush();
			bw.close();
			
			
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			
			String s=br.readLine();
			int count=0;
			int linecount=0;
			int sentencecount=0;
			int wordcount=0;
			while(s!=null){
				String[] str=s.split("[.]");
				sentencecount=sentencecount+str.length;
				String[] str1=s.split(" ");
				wordcount=wordcount+str.length;
				count=count+s.length();
				linecount++;
				
				System.out.println(s);
				s=br.readLine();
			}
			System.out.println("char:"+count);
			System.out.println("line:"+linecount);
			System.out.println("sentence:"+sentencecount);
			System.out.println("word:"+wordcount);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		try {
			InputStream input=new FileInputStream("C:\\Users\\admin\\Documents\\Doc1.docx");
			OutputStream output=new FileOutputStream("C:\\Users\\admin\\Desktop\\folder2\\user\\Doc.docx");
			int set=input.read();
			while(set!=-1){
				output.write(set);
				set=input.read();
			}
			output.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
