package DateTime;

import java.time.Year;
import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int n= sc.nextInt();
		Year y=Year.of(n);
		if(y.isLeap()){
			System.out.printf("%d year is leap year",n);
		}
		else{
			System.out.printf("%d year is not leap year",n);
		}

	}

}
