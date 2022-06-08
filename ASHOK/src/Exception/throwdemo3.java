package Exception;

public class throwdemo3 {
	public static void main(String[] args){
throwdemo3 td1=new throwdemo3();
throwdemo3 td2;
try{
	td1.test();
}
catch(NullPointerException exe){
	System.out.println("cleared");
}
	}
public void test() {
	try{
		throw new NullPointerException();
	}
	catch(NullPointerException exe){
		System.out.println("got it");
		throw exe;
	}
}
}
