package String;

public class reverse {

	public static void main(String[] args) {
	String str="Hello";
	char[] ch=str.toCharArray();
	for(int i=ch.length-1;i>=0;i--){
		System.out.println(ch[i]);
	}
	
	for(int i=str.length()-1;i>=0;i--){
		System.out.println(str.charAt(i));
	}

	}

}
