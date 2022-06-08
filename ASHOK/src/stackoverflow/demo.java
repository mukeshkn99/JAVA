package stackoverflow;

public class demo {

	static int count=1;
	
	static  void printnumber(){
		
		while(count<=10000000){
			System.out.println("Hlo");
			count++;
			printnumber();
		}

			
		}

	public static void main(String[] args) {
		printnumber();
		//System.out.println("bye........");
	}

}
