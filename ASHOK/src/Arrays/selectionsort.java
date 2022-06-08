package Arrays;

public class selectionsort {
public static void sort(int[] a){
	int n=a.length;
	for(int i=0;i<n;i++){
		int midIn=i;
		for(int j=i+1;j<n;j++){
			if(a[j]<a[midIn]){
			midIn=j;
		}
	}
	int temp=a[midIn];
	a[midIn]=a[i];
	a[i]=temp;
	}
}
	public static void main(String[] args) {
     int[] a={13,12,8,9,1};		
selectionsort.sort(a);
for(int elm:a){
	System.out.println(elm);
}
	}
	
	

}
