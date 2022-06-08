package program;

public class armstrongnumber {

	public static void main(String[] args) {
		int no=153;
		int no2=no;
		int arm=0;
while(no>0){
	int rem=no%10;
	arm=arm+(rem*rem*rem);
	no=no/10;
}
System.out.println(arm);
if(arm==no2){
	System.out.println("armstrong");
}else{
	System.out.println("not");
}
	}

}
