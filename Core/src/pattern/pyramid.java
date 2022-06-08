package pattern;

public class pyramid {

	public static void main(String[] args) {
		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=i;k<=4;k++){
				System.out.print("* ");
	}
	System.out.println();
					}
		
		for(int i1=1;i1<=4;i1++){
			for(int j1=1;j1<=i1;j1++){
				System.out.print(" ");
			}
			for(int k1=4;k1>=i1;k1--){
				System.out.print("* ");
			}
		System.out.println();
		}

		
	}

}
