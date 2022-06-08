package string;

public class practice1 {

	public static void main(String[] args) {
		String s1="mukesh aniyappur mukesh";
		char maxch=s1.charAt(0);
		char minch=s1.charAt(0);
		int count=1;
		
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=' '){
				count++;
				
			}
		}
		System.out.println("count char:"+count);
		int word=1;
		for(int i=0;i<s1.length();i++){
		if((s1.charAt(i)==' ')&&(s1.charAt(i+1)!=' ')){
			word++;
		}
		}
System.out.println("count words:"+word);

String rev=" ";

for(int i=s1.length()-1;i>=0;i--){
	if(s1.charAt(i)!=' '){
		rev=rev+s1.charAt(i);
	}
}
System.out.println("rev:"+rev);
char[] ch=s1.toCharArray();
int[] freq=new int[ch.length];
for(int i=0;i<s1.length();i++){
	freq[i]=1;
	for(int j=i+1;j<s1.length();j++){
		if(ch[i]==ch[j]){
			freq[i]++;
			freq[j]=-1;
		}
	}
	int min=freq[0];
	int max=freq[0];
	for(i=0;i<s1.length();i++){
		if(max>freq[i]){
			max=freq[i];
			maxch=ch[i];
		}
		if(min<freq[i]){
			min=freq[i];
			minch=ch[i];
			
		}
	}
}

System.out.println("maximum char:"+maxch);
System.out.println("minimum are:"+minch);


String words=" ";

String[] str=s1.split(" ");
int length=0;
for(int i=0;i<str.length;i++){
	if(s1.charAt(i)!=' '){
		word=word+s1.charAt(i);
	}
	else{
	str[length]=words;
	length++;
	words=" ";
	}
}
String large=str[0];
String small=str[0];
for(int i=0;i<str.length;i++){
	if(large.length()<str[i].length()){
		large=str[i];
	}
	if(small.length()>str[i].length()){
		small=str[i];
	}
}

System.out.println("large words:"+large);
System.out.println("small words:"+small);

System.out.println("Dublicate char are:");
char[] ch3=s1.toCharArray();

for(int i=0;i<s1.length();i++){
	int count2=1;
	for(int j=i+1;j<s1.length();j++){
		if(ch3[i]==ch3[j]){
			count2++;
			ch3[j]='0';
		}
		
	}
	
	if(count2>1&&ch3[i]!='0'){
		System.out.println(ch3[i]);
	}
}

System.out.println("dub words are:");
String[] s4=s1.split(" ");
for(int i=0;i<s4.length;i++){
	int count5=1;
	for(int j=i+1;j<s4.length;j++){
		if(s4[i].equals(s4[j])){
			count5++;
			s4[j]="0";
		}
	}
	if(count5>1&&s4[i]!="0"){
		System.out.println(s4[i]);
	}
}

char search='a';
String print=" ";
for(int i=0;i<s1.length();i++){
	if(search==s1.charAt(i)){
		print=print+s1.charAt(i);
	}
}
System.out.println(search+"is"+print);





}
		}
	

