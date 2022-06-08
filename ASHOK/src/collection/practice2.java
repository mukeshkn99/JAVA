package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practice2 {
public static void main(String[] args){
	String s="goodmorning";
	char[] ch=s.toCharArray();
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	for(char c:ch){
		if(hm.containsKey(c)){
			hm.put(c,hm.get(c)+1);
		}
		else{
			hm.put(c, 1);
		}
	}
	System.out.println(hm);
	
	
	Set <Map.Entry<Character,Integer>> se=hm.entrySet();
	for(Map.Entry<Character,Integer> me:se){
		if(me.getValue()>1){
			System.out.println(me.getKey()+"-"+me.getValue());
		}
	}
}
}
