package Arrays;

public class select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1={1,2,5,3};
		for(int i=0;i<a1.length;i++){
			int midin=i;
			for(int j=i+1;j<a1.length;j++){
				if(a1[j]>a1[midin]){
					midin=j;
				}

			}int temp=a1[midin];
			a1[midin]=a1[i];
			a1[i]=temp;
			System.out.println(a1[i]);

		}
		
	}

}
