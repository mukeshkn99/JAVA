package program;

public class stringpalindrome {

	public static void main(String[] args) {
		String name="liril";
		String rev=" ";
		for(int i=name.length()-1;i>=0;i--){
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);

		if(name.equals(name)){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not");
		}
	}

}
