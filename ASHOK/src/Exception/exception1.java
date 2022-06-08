package Exception;

public class exception1 {
	public static void main(String[] args){
try{
	int a=5;
	int b=0;
    int c=a/b;
    System.out.println(c);
}
catch(Exception e){
	System.out.println("dont enter no from divided 0");
}
}
}