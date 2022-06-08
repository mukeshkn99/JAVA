package program;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		int n1,n2,n3,largest,smallest;
	Scanner sc=new Scanner (System.in);
	System.out.println("enter number1:");
	n1=sc.nextInt();
	System.out.println("enter number2:");
	n2=sc.nextInt();
	System.out.println("enter number3:");
	n3=sc.nextInt();
	
	int temp=n1>n2?n1:n2;
	largest=n3>temp?n3:temp;
	System.out.println("largest number:"+largest);
	
	int temp1=n1<n2?n1:n2;
	smallest=n3<temp1?n3:temp1;
	System.out.println("smallest number:"+smallest);
	}
}
