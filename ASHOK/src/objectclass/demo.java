package objectclass;

public class demo {

	public static void main(String[] args) {
		demo d1=new demo();
		System.out.println(d1);
		System.out.println(d1.hashCode());
		
		demo d=new demo();
		System.out.println(d);
		System.out.println(d.hashCode());
if(d1.equals(d)){
	System.out.println("true statement");
}
else{
	System.out.println("not correct");
}
	}
	public boolean equals(Object o){
	return false;	
	}
	public int hashcode(){
		return 1234;
	}
	public String toString(){
		return "hlo";
	}

}
