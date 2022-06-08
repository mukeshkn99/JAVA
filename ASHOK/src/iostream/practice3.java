package iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class practice3 {

	public static void main(String[] args) {
		File f1=new File("C://Users//admin//Desktop//folder//1.txt");
        try {
			FileWriter fw=new FileWriter(f1,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("hi");
			bw.newLine();
			bw.write("how");
			bw.flush();
			bw.close();
			
			
			FileReader fr=new FileReader(f1);
			BufferedReader br=new BufferedReader(fr);
		   String line=br.readLine();
		   int linecount=0;
		   int sentencecount=0;
		   int wordcount=0;
			int charcount=0;
		   while(line!=null){
			   String[] lic=line.split("[.]");
			   sentencecount=sentencecount+lic.length;
			  String[] wc=line.split(" ");
			  wordcount=wordcount+wc.length;
			  charcount=charcount+line.length();
			   System.out.println(line);
			   line=br.readLine();
			   linecount++;
		   }
			System.out.println("line:"+linecount);
			System.out.println("sentence:"+sentencecount);
			System.out.println("words:"+wordcount);
			System.out.println("char:"+charcount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
