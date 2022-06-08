package Arrays;

import java.util.Scanner;

public class bubblesortdemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please value eneter");
		int a1=sc.nextInt();
		int[] a=new int[a1];
		for(int i=0;i<a.length;i++){
			System.out.println("enter value");
			a[i]=sc.nextInt();
		}
		//int[] a={10,3,7,1};
		int n=a.length;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j]<a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			}
		
				for(int j=0;j<n;j++){
					System.out.println(a[j]+"");
				}
			}
		}
	

		



