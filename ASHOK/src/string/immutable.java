package string;

public class immutable {

	public static void main(String[] args) {
		String s1="kali mukesh mukesh";
		String s2=" Kalai";
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
        boolean result=s1.equals(s2);
        System.out.println(result);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf("a",1));
        System.out.println(s1.lastIndexOf("h"));
        System.out.println(s1.startsWith("k"));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
	    System.out.println(s1.substring(0));
	    System.out.println(s1.substring(0,4));
	    System.out.println(s1.subSequence(6,9));
	    System.out.println(s1.lastIndexOf("mukesh", 17));
	    System.out.println(s2.trim());
	    String s4=String.join("ghhg","ggj");
	    System.out.println(s4.trim()+"gd");  
	    String[] words=s1.split("\\s");
	    for(String w:words){  
	    System.out.println(w); 
	    }
	    String s3="tamiltnadu";
	   
	    char word='n';
	    int count=1;
	    for(int i=1;i<s3.length();i++){
	    	if(word==s3.charAt(i)){
	    		count++;
	    	}
	    	
	    }
	    System.out.println(count);
	    
	    
	    
	}

}
