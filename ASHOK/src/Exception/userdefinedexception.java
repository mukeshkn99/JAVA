package Exception;

public class userdefinedexception extends Exception {
public userdefinedexception(int age){
	System.out.println("enter age"+age);
}

public static void verifyage(int age){
	if(age<18){
		try{
			throw new userdefinedexception( age);
		}
		catch(userdefinedexception e){
			System.out.println("not required");
		}
	}
}
}
