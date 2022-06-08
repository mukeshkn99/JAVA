package project1;

public class string {

	public static void main(String[] args) {
		String s= "Big black ";
		String print=" ";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				print=print+s.charAt(i);
			}
		}
		System.out.println("print words:"+print);
		int count=1;
		char maxch=s.charAt(0);
		char minch=s.charAt(0);
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				count++;
			}
			
		}
		System.out.println("count of char:"+count);

		
		int words=1;
		
		for(int i=0;i<s.length()-1;i++){
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')){
		     words++;		
			}
		}
		System.out.println("count of words:"+words);
		
		
		
		
		
		char search='e';
		int count1=0;
		for(int i=0;i<s.length();i++){
		if(search==s.charAt(i)){
			count1++;
			
		}
		
		}
		System.out.println(search +"is" +count1);
		
		int[] freq=new int[s.length()];
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++){
			freq[i]=1;
			for(int j=i+1;j<s.length();j++){
				if(ch[i]==ch[j]&&ch[i]!=' '&&ch[i]!='0'){
					freq[i]++;
					ch[j]='0';
				}
			}
		}
	int max=freq[0];
	 int min=freq[0];
	 for(int i=0;i<freq.length;i++){
		 if(max<freq[i]){
			 max=freq[i];
			 maxch=ch[i];
		 }
		 if(min>freq[i]){
			 min=freq[i];
			 minch=ch[i];
		 }
	 }
		System.out.println("maximum:"+maxch);
		System.out.println("minimum:"+minch);
		
		String word=" ";String small="";String large="";
		String[] s2=new String[100];
		int length=0;
		s=s+"";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				word=word+s.charAt(i);
			}
			else{
				s2[length]=word;
				length++;
				
				word=" ";
			}
		}
		
		
		 small=s2[0];
		large=s2[0];
		for(int i=0;i<length;i++){
			if(large.length()<s2[i].length()){
				large=s2[i];
			}
			if(small.length()>s2[i].length()){
				small=s2[i];
			}
		}
		System.out.println("large words:"+large);
		
		System.out.println("small words:"+small);
		
		
		String rev=" ";
		for(int i=s.length()-1;i>0;i--){
			if(s.charAt(i)!=' '){
				rev=rev+s.charAt(i);
			}
		}
		System.out.println("reverse:"+rev);
		
		
		System.out.println("dublicate char:");
		char[] ch2=s.toCharArray();
		for(int i=0;i<s.length();i++){
			int count3=1;
			for(int j=i+1;j<s.length();j++){
				if(ch2[i]==ch2[j]){
					count3++;
					ch2[j]='0';
				}
			}	
			if(ch2[i]!='0'){
				
				System.out.println(ch2[i]);
			}
		}
		
		System.out.println("dublicate words:");
	String[] s4=s.split(" ");
	for(int i=0;i<s4.length;i++){
		int words1=1;
		for(int j=i+1;j<s4.length;j++){
			if(s4[i].equals(s4[j])){
				words1++;
				s4[j]="0";
			}
		}
		if(words1>1&&s4[i]!="0"){
			System.out.println(s4[i]);
		}
	}
	
	}

}
