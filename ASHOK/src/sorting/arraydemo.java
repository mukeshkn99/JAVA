package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class arraydemo {

	public static void main(String[] args) {
		int[] a={2,1,3,4,5};
		System.out.println("before sorting are:");
		for(int i:a){
			System.out.println(i);
		}
		Arrays.sort(a);
		System.out.println("before sorting are:");
		for(int i:a){
			System.out.println(i);
		}
		
		String[] arr={"tami","english","science","maths"};
		Arrays.sort(a);
		System.out.println("After sorting string:");
		for(String i:arr){
			System.out.println(i);
		}
		
		comparatordemo comp=new comparatordemo();
		Arrays.sort(arr, comp);
		System.out.println("after compare are");
		for(String s:arr){
			System.out.println(s);
		}
		

	}

}
