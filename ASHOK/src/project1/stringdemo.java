package project1;

public class stringdemo {

	public static void main(String[] args) {
		String s="kalai arasan arasan";
		System.out.println("print name:"+s);
		char minchar=s.charAt(0);
		char maxchar=s.charAt(0);
    
		int count=1;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				count++;
			}
		}
		 System.out.println("count of char:"+count);
		
		int wordcount=1;
		for(int i=0;i<s.length() -1;i++){
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')){
				wordcount++;
			}
		}
		System.out.println("count of words:"+wordcount);
		
		
		
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)!=' '){
				rev=rev+s.charAt(i);
				
			}
		}
		System.out.println("reverse string:"+rev);
		
		int[] freq=new int[s.length()];
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++){
			freq[i]=1;
			for(int j=i+1;j<s.length();j++){
				if(ch[i]==ch[j]){
					freq[i]++;
					ch[j]='0';
				}
			}
				int max=freq[0];
				int min=freq[0];
				for( i=0;i<freq.length;i++){
				if(max<freq[i]){
					max=freq[i];
					maxchar=ch[i];
				}
				if(min>freq[i]){
					min=freq[i];
					minchar=ch[i];
				}
			}
			System.out.println("maximum char:"+maxchar);
			System.out.println("minimum char:"+minchar);
		}
		
		String word=" ";
		int length=0;
		String[] str=new String[100];
		s=s+" ";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				word=word+s.charAt(i);
			}
			else{
				str[length]=word;
				length++;
				word=" ";
			}
		}
	
		String small=str[0];
		String large=str[0];
		for(int i=0;i<length;i++){
			if(large.length()<str[i].length()){
				large=str[i];
			}
			if(small.length()>str[i].length()){
				small=str[i];
			}
		}
		System.out.println("large word:"+large);
		System.out.println("small word:"+small);
		
		System.out.println("dublicate char:");
		char[] ch1=s.toCharArray();
		for(int i=0;i<s.length();i++){
			int count4=1;
			for(int j=i+1;j<s.length();j++){
				if(ch1[i]==ch1[j]){
					count4++;
					ch1[j]='0';
				}
				
			}
		
			if(count>1&&ch1[i]!='0'){
				System.out.println(ch1[i]);
			}
		}
		System.out.println("count of dub words:");
		String[] s8=s.split(" ");
		for(int i=0;i<s8.length;i++){
			int words5=1;
			for(int j=i+1;j<s8.length;j++){
				if(s8[i].equals(s8[j])){
					words5++;
					s8[j]="0";
				}
			}
			if(words5>1&&s8[i]!="0"){
			System.out.println(s8[i]);	
			}
			}
		
		
		
		
		
	}

	}

