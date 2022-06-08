package com.file.name;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Loading {
public static void main(String[] args){
	String name="agilesys";
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	char[] c=name.toCharArray();
	for(char d:c){
		if(hm.containsKey(d)){
			hm.put(d,hm.get(d)+1);
		}
		else{
			hm.put(d, 1);
		}
	}
	System.out.println(hm);
	
	/*Set<Map.Entry<Character,Integer>> se=hm.entrySet();
	for(Map.Entry<Character,Integer> s:se){
		if(s.getKey()>1)
		System.out.println(s.getKey()+s.getValue());
	}*/

}
}
