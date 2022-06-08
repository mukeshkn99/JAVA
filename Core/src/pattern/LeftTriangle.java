package pattern;

public class LeftTriangle {

	public static void main(String[] args) {
		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=i;k<=4;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
