package Exception;

public class throwsdemo {

	public static void main(String[] args) {
		throwsdemo td1=new throwsdemo();
		throwsdemo td2;
		
		try{
			 td1.test();
		}
		catch(NullPointerException npe){
			System.out.println("cleared");
		}
		
	}
	public void test(){
try{
		throw new NullPointerException();	
		}
		catch(NullPointerException npe){
			System.out.println("got npe");
			throw npe;
		}
	}

}
