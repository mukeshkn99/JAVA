package Exception;

public class handlingdemo {

	public static void main(String[] args) {
		int a=5,b=5;
		try{
		int c=a/b;
		System.out.println(c);
		try{
			if(a<b){
				b=a;
			}
			if(a==b){
				int[] d={1,2,3};
				d[9]=123;
			}
		}
		catch(Exception e){
			System.out.println("arrayindex");
			}
		
		}
		catch(Exception e){
			System.out.println("please not enter o value");
		}
	}

}
