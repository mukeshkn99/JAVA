package Exception;

public class throwdemo {

	public static void main(String[] args) {
		method m=new method();
		try{
			m.print(0, 1);
		}
		catch(Exception e){
			System.out.println("not enter 0");
		}

	}

	
	

}
