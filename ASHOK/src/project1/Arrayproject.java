package project1;

public class Arrayproject {

	public static void main(String[] args) {
		int[] a={1,5,0,8,6,2,1,2};
		/*for(int i:a){
			System.out.println(i);
		}
		
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=' '){
				count++;	
			}		
			}
		System.out.println("count:"+count);
		
		int n=a.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
			}
		System.out.println("order :");
		for(int j=0;j<n;j++){
			System.out.println(a[j]);
		}
		int[] freq=new int[a.length];
		for(int i=0;i<a.length;i++){
			int count1=1;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					count1++;
					freq[j]=-1;
				}
				if(freq[i]!=-1){
					freq[i]=count1;
				}
			}
		}
		int dub=0;
				
		for(int i=0;i<freq.length;i++){
	if(freq[i]>1){
		dub++;
	}
		
		}
		System.out.println("count dub are:");
		System.out.println(dub);
		*/
		
		int n1=3;
		for(int i=0;i<n1;i++){
			int k;
			int mid=a[a.length-1];
			for(k=a.length-1;k>0;k--){
				a[k]=a[k-1];
			}
			mid=a[k];	
		}
		
		System.out.println("left shift are:");
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]+" ");
		}
		
		int max=a[0];
		int secondmax=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				secondmax=max;
				max=a[i];
			}
			if(secondmax<a[i]){
			secondmax=a[i];	
			}
			
		}
		System.out.println("maximum are:"+max);
		System.out.println("second maximum are:"+secondmax);
		
		int min=a[0];
		int secondmin=a[0];
		for(int i=0;i<a.length;i++){
			if(min>a[i]){
				secondmin=min;
				min=a[i];
			}
			if(secondmin>a[i]){
			secondmin=a[i];	
			}
			
		}
		System.out.println("minimum are:"+min);
		System.out.println("second minimum are:"+secondmin);
		
		}
}



