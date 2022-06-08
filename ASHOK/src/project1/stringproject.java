package project1;

public class stringproject {

	public static void main(String[] args) {
String s1="tamil payilagam tamil";
System.out.println(s1);
int count=1;
for(int i=0;i<s1.length();i++){
	if(s1.charAt(i)!=' '){
		count++;
	}
}System.out.println("char:"+count);


int word=1;
for(int i=0;i<s1.length()-1;i++){
	if((s1.charAt(i)==' ')&&(s1.charAt(i+1)!=' ')){
		word++;
	}
}System.out.println("word:"+word);

/*
String s2="file";
s1=s1+s2;
s2=s1.substring(0,s1.length()-s2.length());
s1=s1.substring(s2.length());
System.out.println(s1);
System.out.println(s2);
*/

System.out.println("find max are:");
int[] freq=new int[s1.length()];
char[] ch=s1.toCharArray();
char maxch=s1.charAt(0);
char minch=s1.charAt(0);
for(int i=0;i<s1.length();i++){
freq[i]=1;
for(int j=i+1;j<s1.length();j++){
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
}if(min>freq[i]){
	min=freq[i];
	minch=ch[i];
}
}
System.out.println("max:"+maxch);
System.out.println("min:"+minch);
String[] s2=s1.split("");
String words=" ",small=" ",large=" ";
int length=0;
for(int i=0;i<s1.length();i++){
if(s1.charAt(i)!=' '){
	words=words+s1.charAt(i);
}else{
	s2[length]=words;
	length++;
	words=" ";
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
 }System.out.println("large word:"+large);
 System.out.println("small word:"+small);

 System.out.println("find dub char:"); 
 char[] ch1=s1.toCharArray();
  for(int i=0;i<s1.length();i++){
 int count1=1;
 for(int j=i+1;j<s1.length();j++){
 	if(ch1[i]==ch1[j]){
 		count1++;
 		ch1[j]='0';
 		
 	}
 }

 if(count1>1&&ch1[i]!='0'){
		System.out.println(ch1[i]);
	}
 }

  System.out.println("find dub word:");
  String[] s4=s1.split(" ");
  for(int i=0;i<s4.length;i++){
 int count3=1;
 for(int j=i+1;j<s4.length;j++){
 	if(s4[i].equals(s4[j])){
 		count3++;
 		s4[j]="0";
 		
 	}
 }

 if(count3>1&&s4[i]!="0"){
		System.out.println(s4[i]);
	}
 }

 char search='a';
 int count5=0;
 for(int i=0;i<s1.length();i++){
	 if(search==s1.charAt(i)){
		count5++; 
	 }
 }
 System.out.println(search+"is"+count5);
 
 
}

}
















