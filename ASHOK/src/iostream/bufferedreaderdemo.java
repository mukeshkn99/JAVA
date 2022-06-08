package iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedreaderdemo {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\admin\\Desktop\\folder\\1.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(f,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("tamil");
			bw.newLine();
			bw.write("english");
			bw.newLine();
			bw.write("maths");
			bw.flush();
			bw.close();
			
			FileReader fr = new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String s=br.readLine();
			int linecount=0;
			int sentencecount=0;
			int wordcount=0;
			int charcount=0;
			while(s!=null){
				String[] s2=s.split("[.]");
				sentencecount=sentencecount+s2.length;
				String[] s3=s.split(" ");
				wordcount=wordcount+s3.length;
				charcount=charcount+s.length();
				System.out.println(s);
				linecount++;
				s=br.readLine();
				
				
			}
			System.out.println("line:"+linecount);
			System.out.println("sentence:"+sentencecount);
			System.out.println("word:"+wordcount);
			System.out.println("char:"+charcount);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
