package Exception;



public class userdefinedexception1 extends Exception {
	static int age;
public userdefinedexception1(int age){
	System.out.println(age);
}
public static void method(int age){
	if(age<18)
	try{
		throw new userdefinedexception1(age);
	}
	catch(userdefinedexception1 exe){
		System.out.println("not valid age");
	}
}
}
