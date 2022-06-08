package program;

public class palindrome {

	public static void main(String[] args) {
		int no=123;
		int no2=no;
		int rem=0;
		while(no>0){
		
			rem=(rem*10)+no%10;
			no=no/10;
		}
System.out.println(rem);

if(rem==no2){
	System.out.println("palindrome");
}
else{
	System.out.println("not");
}
	}

}
