package String;

import java.util.Arrays;

public class sorted {

	public static void main(String[] args) {
String str="java";
char[] ch=str.toCharArray();
char temp;
for(int i=0;i<ch.length;i++){
	for(int j=i+1;j<ch.length;j++){
		if(ch[i]>ch[j]){
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
	}
}
System.out.println(new String(ch));

char[] ch1=str.toCharArray();
Arrays.sort(ch1);

System.out.println(ch1);
	}

}
