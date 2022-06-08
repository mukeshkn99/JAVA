package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practice3 {
public static void main(String[] args){
	String s="tamil english maths tamil";
	String[] s1=s.split(" ");
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	for(String se:s1){
		if(hm.containsKey(se)){
			hm.put(se, hm.get(se)+1);
		}
		else{
			hm.put(se, 1);
		}
	}
	System.out.println(hm);
	Set <Map.Entry<String,Integer>> me=hm.entrySet();
	for(Map.Entry<String,Integer> si:me){
		if(si.getValue()>1){
			System.out.println(si.getKey()+"="+si.getValue());
		}
	}
}
}
