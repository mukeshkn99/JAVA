package pattern;

public class program1 {

	public static void main(String[] args) {
		int i,j;
		
		for(i=5;i>0;i--){
			for(j=i;j<=i;j++){
				System.out.print(" ");
			}
			int no=1;
			for(int k=i;k<4;k++){
				System.out.print(no);
				no++;
			}
			
			System.out.println(" ");
			
		}
		
		for(int i1=0;i1<5;i1++){
			for(int j1=5;j1>i1;j1--){
				System.out.print(" ");
			}
			int no1=1;
			for(int k1=i1;k1<5;k1++){
				System.out.print(no1);
				no1++;
			}
		System.out.println(" ");
		}
		
	}
		

	}


