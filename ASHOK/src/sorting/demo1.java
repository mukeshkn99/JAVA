package sorting;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter number");
		int len=sc.nextInt();
		int[] a=new int[len];
		for(int i=0;i<len;i++){
			System.out.println("enter value");
			a[i]=sc.nextInt();
		}
		//int[] a={2,1,4,3,0};
		int n=a.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
			if(a[j]>a[j+1]){
				int swap=a[j];
				a[j]=a[j+1];
				a[j+1]=swap;
			}
			}
	}
			for(int j=0;j<n;j++){
				System.out.println(a[j]+"");
			}
		}

	}



