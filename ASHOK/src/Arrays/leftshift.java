package Arrays;

public class leftshift {

	public static void main(String[] args) {
		int [] p={4,6,9,8};
		
		int n=2;
		for(int i=0;i<n;i++){
			int j;
			int temp=p[0];
			for( j=0;j<p.length-1;j++){
				p[j]=p[j+1];
			}
			p[j]=temp;
		}
		
		for(int j=0;j<p.length;j++){
			System.out.println(p[j]+" ");
		}
	}
	
}
