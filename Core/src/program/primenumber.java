package program;

public class primenumber {

	public static void main(String[] args) {
		int no=12;
		boolean prime=true;
		for(int i=1;i<no;i++){
			if(no%i==0){
				System.out.println(no+":notprime"+i);
				prime=false;
				
			}
			else{
				prime=true;
				System.out.println(no+":primenum");
				
			}
		}

	}

}
