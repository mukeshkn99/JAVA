package sorting;

import Arrays.selectionsort;

public class demo {
	public  static void sort(int[] c){
	int n=c.length;
	for(int i=0;i<n;i++){
		int min=i;
		for(int j=i+1;j<n-1;j++){
			if(c[j]<c[min]){
				c[min]=j;
			}
		}
		int temp=c[min];
		c[min]=c[i];
		c[i]=temp;
	}
	}
	public static void main(String[] args) {
		int[] c={11,4,7,8};
		selectionsort.sort(c);
for(int l:c){
	System.out.println(l);
}
	}

}
