package Arrays;

public class shift {

	public static void main(String[] args) {
		int[] a={1,2,1,3};
			int n=2;
			for( int i=0;i<n;i++){
				int j;
				int temp=a[a.length-1];
				for(j=a.length-1;j>0;j--){
					a[j]=a[j-1];
				}
				a[0]=temp;
			}
			for(int j=0;j<a.length;j++){
				System.out.println(a[j]);
			}
			
	}
}
