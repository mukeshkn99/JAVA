package Arrays;

public class practice2 {

	public static void main(String[] args) {
		int[] a={1,3,2,6,5,1,3};
	/*int count=0;
	for(int i=0;i<a.length;i++){
	if(a[i]!=' '){
		count++;
	}	
	}
	System.out.println("char:"+count);
	
	int n=a.length;
	for(int i=0;i<n;i++){
		for(int j=0;j<n-i-1;j++){
			if(a[j]>a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			
		}
		for(int j=0;j<n;j++){
			System.out.println(a[j]+" ");
		}
		
		int[] freq=new int[a.length];
		for(i=0;i<a.length;i++){
		int count2=1;
		for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j]){
			count2++;
			freq[j]=-1;
			}
			if(freq[i]!=-1){
				freq[i]=count2;
			}
		}
		}
	
		for(i=0;i<freq.length;i++){
			if(freq[i]!=-1){
			 System.out.println(a[i]+"contains:"+freq[i]);
			}
		}
		
	}
	
	
	int n1=3;
	int j;
	for(int i=0;i<n1;i++){
		int temp=a[0];
		for(j=0;j<a.length-1;j++){
			a[j]=a[j+1];
		}
	a[j]=temp;
	}
	System.out.println("left shifts are:");
	for(j=0;j<a.length;j++){
	System.out.println(a[j]);
	}
	int n2=3;
	
	for(int i=0;i<n2;i++){
		int midid=a[a.length-1];
		for(j=a.length-1;j>0;j--){
			a[j]=a[j-1];
		}
		a[0]=midid;
	}
	System.out.println("right shifts are:");
	for(j=0;j<a.length;j++){
		System.out.println(a[j]);
	}
	
	int max=a[0];
	for(int i=0;i<a.length;i++){
		if(max<a[i]){
			max=a[i];
		}
	}
	System.out.println("maximum:"+max);
	*/
		
	int i1=0;
	int min=a[0];
	int secondmin=a[0];
	for(i1=0;i1<a.length;i1++){
		if(min>a[i1]){
			secondmin=min;
			min=a[i1];
		}
		else if(secondmin>a[i1]){
			secondmin=a[i1];
		}
	}
	System.out.println("minimum are:"+min);
	System.out.println("minimum are:"+secondmin);
	}
	
	}
	
