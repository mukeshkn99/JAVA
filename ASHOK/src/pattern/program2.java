package pattern;

public class program2 {

	public static void main(String[] args) {
		int i,j;
		for(i=0;i<4;i++){
			for(j=0;j<=i;j++){
				System.out.print(i);
			}
		System.out.println();
		}

		for(int i1=5;i1>0;i1--){
			for(int j1=0;j1<i1;j1++){
				System.out.print(i1);
			}
		System.out.println();
		}
		
		for(int i2=5;i2>0;i2--){
			for(int j2=0;j2<i2;j2++){
				System.out.print(" ");
			}
			for(int k2=5;k2>=i2;k2--){
				System.out.print(k2);
			}
		System.out.println();
		}
		
		for(int i3=0;i3<5;i3++){
			for(int j3=0;j3<i3;j3++){
				System.out.print(" ");
			}
			for(int k3=5;k3>i3;k3--){
				System.out.print(k3);
			}
		System.out.println();
		}
		
	}

}
