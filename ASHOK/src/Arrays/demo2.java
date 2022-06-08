package Arrays;

public class demo2 {

	public static void main(String[] args) {
		int[] no={1,2,3,4,8};
		int n=3;
		for(int i=0;i<n;i++){
			int j;
			int mid=no[no.length-1];
			for( j=no.length-1;j>0;j--){
				no[j]=no[j-1];
			}
			no[0]=mid;
	
		}
		for(int j=0;j<no.length;j++){
			System.out.println(no[j]);
		}
		
	}

}
