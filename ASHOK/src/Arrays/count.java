package Arrays;

public class count {

	public static void main(String[] args) {
		int[] a={1,2,1,2,3,4,3,4,3,5,6,5,7};
		int[] freq=new int[a.length];
		
		for(int i=0;i<a.length;i++){
			int count=1;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
					freq[j]=-1;
				}
			}
			if(freq[i]!=-1){
				freq[i]=count;
			}
		}
		
			for(int i=0;i<freq.length;i++){
				if(freq[i]!=-1){
					System.out.println(a[i]+"is appeared"+freq[i]);
				}
			}
			
		

	}

}
