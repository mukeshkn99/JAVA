package Function;

import java.util.Scanner;
import java.util.function.Function;

public class Authentication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user:");
		String user=sc.next();
		System.out.println("enter password:");
		String pwd=sc.next();
		Function<String,String> f1=s->s.substring(0,5);
		Function<String,String> f2=s->s.toLowerCase();
		if(f1.andThen(f2).apply(user).equals("durga")&& pwd.equals("java")){
			 System.out.println("valid User");
		}
		else{
			System.out.println("not valid");
		}

	}

}
