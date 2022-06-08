package String;

public class removedwhitespace {

	public static void main(String[] args) {
		String str="@#$1234java";
		String replaceAll = str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(replaceAll);

	}
	
	

}