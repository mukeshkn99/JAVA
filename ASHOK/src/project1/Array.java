package project1;

import Arrays.selectionsort;

public class Array {
public static void sort(int[] a){
	
	
	int n=a.length;
	
	for(int i=0;i<n;i++){
		int midin=i;
		for(int j=i+1;j<n-i-1;j++){
			if(a[i]>a[j]){
				midin=a[j];
			}
		}
		int temp=a[i];
		a[i]=a[midin];
		a[midin]=temp;
	}
}

	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6};
        
		System.out.println("length is:"+a.length);
		selectionsort.sort(a);
        System.out.println("order:");
        for(int elm:a){
        	
        	System.out.println(elm);
        }
        int[] freq=new int[a.length];
        for(int i=0;i<a.length;i++){
        	
        	int count=1;
        	for(int j=i+1;j<a.length;j++){
        		if(freq[i]==freq[j]){
        			count++;
        			freq[j]=-1;
        		}
        	
        
        	if(freq[i]!=-1){
        		freq[i]=count;        
        		}
        }
        }
        int countofdub=0;
        for(int i=0;i<freq.length;i++){
        	if(freq[i]>1){
        		countofdub++;
        	}
        }
        System.out.println("dublicate");
        System.out.println(countofdub);
        
        
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
        	if(max<a[i]){
        		max=a[i];
        	}
        	if(min>a[i]){
        		min=a[i];
        	}
        }
        System.out.println("maximum");
        System.out.println(max);
        System.out.println("minimum");
        System.out.println(min);
        int n1=3;
        for(int k=0;k<n1;k++){
        	k=0;
        	int l;
        	int left=a[0];
        	for(k=0;k<a.length-1;k++){
        		a[k]=a[k+1];
        	}
        	left=a[k];
        }
        System.out.println("left shift");
        for(int k=0;k<a.length;k++){
        	System.out.println(a[k]);
        }
	}

	}


