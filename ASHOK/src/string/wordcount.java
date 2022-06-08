package string;

public class wordcount {

	public static void main(String[] args) {
		String s1="column name";
		int words=1;
		
		for(int i=0;i<s1.length() -1;i++){
			if((s1.charAt(i)==' ')&&(s1.charAt(i+1)!=' ')){
				words++;
			}
			
		}
		System.out.println("count of word:"+words);	

	}

}
