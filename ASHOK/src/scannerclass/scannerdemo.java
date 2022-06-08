package scannerclass;

import java.util.Scanner;

public class scannerdemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1:");
		int no1=sc.nextInt();
		System.out.println("enter number 2:");
		int no2=sc.nextInt();
		System.out.println(no1+no2);
		
		if(no1<no2){
			System.out.println("no2 is large:"+no2);
		}
		else if(no1>no2){
			System.out.println("no1 is large:"+no1);
		}
		else{
			System.out.println("no is equal:"+no2+no1);
		}

	}

}
