package String;

public class reverseeachword {

	public static void main(String[] args) {
		String str="Java Code";
		System.out.println("original code:"+str);
		String output=" ";
		String[] word=str.split(" ");
		for(String words:word){
			String reversed=" ";
			for(int i=words.length()-1;i>=0;i--){
				reversed=reversed+str.charAt(i);
			}
		output=output+reversed+" ";	
		
		}
		System.out.println("reversed word:"+output);
		
		

	}

}
