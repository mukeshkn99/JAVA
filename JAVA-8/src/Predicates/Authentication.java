package Predicates;

import java.util.Scanner;
import java.util.function.Predicate;

public class Authentication {

	public static void main(String[] args) {
		Predicate<user> p=u->u.username.equals("durga")&&u.password.equals("java");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String name = sc.next();
		System.out.println("enter password");
		String pass=sc.next();
		user use=new user(name,pass);
		if(p.test(use)){
			System.out.println("email id and password is correct");
		}
		else{
			System.out.println("Invalid Credentials...!!!");
		}
       
	}

}
