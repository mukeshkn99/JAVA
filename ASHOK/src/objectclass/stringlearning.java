package objectclass;

public class stringlearning {

	public static void main(String[] args) {
		stringlearning sl=new stringlearning();
        System.out.println("Hashcode of is"+sl);
        System.out.println("hashcode"+sl.hashCode());
        
        stringlearning sl2=new stringlearning();
        System.out.println(sl2);
        System.out.println(sl2.hashCode());
        if(sl.equals(sl2)){
    		System.out.println("correct");
    	}
        else{
        	System.out.println("not correct");
        }
	}
	public boolean equals(Object o){
		return true;
	}
	public int hashcode(){
		return 1234;
		
	}
public String toString(){
	return "hi";
}

}
