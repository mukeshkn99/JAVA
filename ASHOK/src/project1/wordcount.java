package project1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class wordcount {

	public static void main(String[] args) {
		String s="mukesh mukesh kamarj";
		//char[] ch=s.toCharArray();
		String[] str=s.split(" ");
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(String c:str){
			if(hm.containsKey(c)){
			   hm.put(c,hm.get(c)+1);
			}
			else{
				hm.put(c,1);
			}
		}
System.out.println(hm);
Set<Map.Entry<String,Integer>>  me=hm.entrySet();
for(Map.Entry<String, Integer> s1:me){
	if(s1.getValue()!=0)
	System.out.println(s1.getKey()+":"+s1.getValue());
}
	}

}
