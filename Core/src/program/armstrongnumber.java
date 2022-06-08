package program;

public class armstrongnumber {
public static void main(String[] args){
	int no=153,arm=0,rem;
	int no2=no;
	while(no>0){
		rem=no%10;
		arm=arm+(rem*rem*rem);
		no=no/10;
	}
System.out.println(arm);
if(arm==no2){
	System.out.println("arm");
}
}
}
