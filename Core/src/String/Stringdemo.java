package String;

public class Stringdemo {
	public static void main(String[] args) {
		String name = "arasan kalai arasan";
		// char minch=name.charAt(0);
		// char maxch=name.charAt(0);
		// String print=" ";
		// for(int i=0;i<name.length();i++){
		// if(name.charAt(i)!=' '){
		// print=print+name.charAt(i);
		// }
		// }
		// System.out.println(print);
		// System.out.println(print.trim());
		// System.out.println(print.indexOf("t"));
		// System.out.println(print.subSequence(1,4));
		// System.out.println(print.endsWith("tamil"));
		//
		// int count=0;
		// for(int i=0;i<name.length();i++){
		// if(name.charAt(i)!=' '){
		// count++;
		// }
		// }System.out.println("count of char:"+count);
		//
		// int words=0;
		// for(int i=0;i<name.length();i++){
		// if(name.charAt(i)==' '){
		// words++;
		// }
		// }System.out.println("count of words:"+words);
		//
		// String rev=" ";
		// for(int i=name.length()-1;i>=0;i--){
		// if(name.charAt(i)!=' '){
		// rev=rev+name.charAt(i);
		// }
		// }System.out.println("reverse char:"+rev);
		//
		// String[] s=name.split(" ");
		// System.out.println("reverse words are:");
		// for(int i=s.length-1;i>=0;i--){
		// System.out.println(s[i]);
		// }
		//
		// char search='a';
		// int count3=0;
		// for(int i=0;i<name.length();i++){
		// if(search==name.charAt(i)){
		// count3++;
		// }
		// }
		// System.out.println(search+"is"+count3);
		//
		// char[] ch=name.toCharArray();
		// int freq[]=new int[name.length()];
		// for(int i=0;i<name.length();i++){
		// freq[i]=1;
		// for(int j=i+1;j<name.length();j++){
		// if(ch[i]==ch[j]&&ch[i]!=' ' &&ch[i]=='0'){
		// freq[i]++;
		// ch[j]='0';
		// }
		// }
		// }
		// int min=freq[0];
		// int max=freq[0];
		// for( int i=0;i<freq.length;i++){
		// if(max<freq[i]){
		// max=freq[i];
		// maxch=ch[i];
		// }
		// if(min>freq[i]){
		// min=freq[i];
		// minch=ch[i];
		// }
		// }
		// System.out.println("minimum char:"+minch);
		// System.out.println("maximum char:"+maxch);
		//
		// String[] str=name.split(" ");
		// int length=0;
		// String word=" ";
		// String large=" ";
		// String small=" ";
		//
		// for(int i=0;i<name.length();i++){
		// if(name.charAt(i)!=' '){
		// word=word+name.charAt(i);
		// }
		// else{
		// str[length]=word;
		// length++;
		// word=word+" ";
		// }
		// }
		//
		// large=str[0];
		// small=str[0];
		// for(int i=0;i<length;i++){
		// if(large.length()<str[i].length()){
		// large=str[i];
		// }
		// if(small.length()>str[i].length()){
		// small=str[i];
		// }
		// }
		// System.out.println("large words:"+large);
		// System.out.println("small words:"+small);
		//
		// System.out.println("dub char:");
		// char[] ch2=name.toCharArray();
		// for(int i=0;i<name.length();i++){
		// int count8=1;
		// for(int j=i+1;j<name.length();j++){
		// if(ch2[i]==ch2[j]){
		// count8++;
		// ch2[j]='0';
		// }
		// }
		// if(count8>1&&ch2[i]!='0'){
		// System.out.println(ch2[i]);
		// }
		// }
		System.out.println("Dublicate Words :");
		String[] st = name.split(" ");
		for (int i= 0; i< st.length; i++) {
			int word1 = 0;
			for (int j= i + 1; j< st.length; j++) {
		 		if (st[i].equals(st[j])) {
					word1++;
					st[j] = "0";
				}
			}
			if (word1 > 1&&st[i]!= "0") {
				System.out.println(st[i]);
			}

		}

	}

}
