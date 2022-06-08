package serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.ObjectInputStream;



public class persist1  {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		try {
			FileInputStream fos=new FileInputStream("D://NewJava//ASHOK//src//file1.txt");
			ObjectInputStream oos=new ObjectInputStream(fos);
			student s=new student("kanesh",8787);
			oos.readObject();
			oos.close();
			System.out.println("i am change  stream  to object");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("change object to straem ");
		}

	}

}
