package program;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number:");
		int no=sc.nextInt();
		
		if(no%2==0){
			System.out.println(no+"not prime");
		}
		else{
			System.out.println(no+"prime");
		}
		}
	

}
