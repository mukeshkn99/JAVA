package program;

public class fibonacciseries {

	public static void main(String[] args) {
		int n1=0,n2=1,temp,n=10;
		System.out.println(n1+""+n2);
		for(int i=0;i<n;i++){
		temp=n1+n2;
		n1=n2;
		n2=temp;
		System.out.println(temp);
		}
	}

}
