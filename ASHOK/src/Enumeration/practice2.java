package Enumeration;

public class practice2 {
public static void main(String[] args){
	practice1[] p1=practice1.values();
	for(practice1 p:p1){
		System.out.println(p+"-->"+p.ordinal()+p.salary);
	}
	practice1.AJITH.act();
	practice1.VIJAY.act1();
	practice1.YASH.act2();
}


}
