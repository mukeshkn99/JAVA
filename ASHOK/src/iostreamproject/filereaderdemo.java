package iostreamproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filereaderdemo {
public static void main(String[] args){
	File file=new File("C:\\Users\\admin\\Desktop\\folder\\subfolder\\file.txt");
	try {
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.flush();
		bw.close();
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
			String result=br.readLine();
			int linecount=0;
			int sentencecount=0;
			int wordcount=0;
			int charcount=0;
		while(result!=null){
			String[] sentence=result.split("[.]");
			sentencecount=sentencecount+sentence.length;
			String[] word=result.split(" ");
			wordcount=wordcount+word.length;
			
			charcount=charcount+result.length();
			
			linecount++;
			System.out.println(result);
			result=br.readLine();
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
