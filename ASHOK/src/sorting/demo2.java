package sorting;

import java.util.Scanner;

import Arrays.selectionsort;

public class demo2 {
public static void sort(int[] a){
	int n=a.length;
    for(int i=0;i<n;i++){
    	int min=i;
    	for(int j=i+1;j<n;j++){
    		if(a[j]<a[min]){
    			a[min]=j;
    		}
    	}
    	int temp=a[min];
    	a[min]=a[i];
    	a[i]=temp;
    }
}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter number");
		int length=sc.nextInt();
		int[] a=new int[length];
		for(int i=0;i<length;i++){
			System.out.println("enter value");
			a[i]=sc.nextInt();
		}
    //int[] a={87,85,989,637};
    selectionsort.sort(a);
for(int elm:a){
	System.out.println(elm);
}

	}

}
