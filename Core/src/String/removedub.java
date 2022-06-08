package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class removedub {

	public static void main(String[] args) {
		String str = "programming";
        char[] arr = str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
        	Boolean repeated=false;
        	for(int j=i+1;j<arr.length;j++){
        		if(arr[i]==arr[j]){
        			repeated=true;
        			break;
        		}
        	}
        if(!repeated){
        	sb.append(arr[i]); 
        }
        
	}
        System.out.println(sb);
        
        StringBuilder sb1=new StringBuilder();
        Set<Character> s=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
        	s.add(str.charAt(i));
        }
        for(Character c:s){
        	sb1.append(c);
        }
	System.out.println(sb1);
	}
}
