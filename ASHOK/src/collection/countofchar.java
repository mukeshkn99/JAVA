package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countofchar {

	public static void main(String[] args) {
		String s="mukeshaniyappur";
		char[] ch=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
         for(char c:ch){
        	 if(hm.containsKey(c)){
        		 hm.put(c,hm.get(c)+1);
        	 }
        	 else{
        		 hm.put(c,1);
        	 }
        	 
         }
         System.out.println(hm);
         
         Set<Map.Entry<Character,Integer>> se=hm.entrySet();
         System.out.println("count of dublicate char:");
        for(Map.Entry<Character,Integer> me:se){
        	if(me.getValue()>1)
        	System.out.println(me.getKey()+":"+me.getValue());
        }
        
        String s1="mukesh tamil tamil aniyappur";
		String[] s2=s1.split(" ");
		HashMap<String,Integer> hm2=new HashMap<String,Integer>();
         for(String c:s2){
        	 if(hm2.containsKey(c)){
        		 hm2.put(c,hm2.get(c)+1);
        	 }
        	 else{
        		 hm2.put(c,1);
        	 }
        	 
         }
         System.out.println(hm2);
         
         Set<Map.Entry<String,Integer>> se2=hm2.entrySet();
         System.out.println("count of dublicate word:");
        for(Map.Entry<String,Integer> me1:se2){
        	if(me1.getValue()>1)
        	System.out.println(me1.getKey()+":"+me1.getValue());
        }
        
	}

}
