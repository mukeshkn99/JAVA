package Anonymous;

public class Test implements Interf{

	int x=888;
	public void m2(){
	Interf i=()->{
	           int x=999;
	            System.out.println(this.x);	
	};
	i.m1();
}
	public static void main(String[] args){
		Test t=new Test();
		t.m2();
	}
	@Override
	public void m1() {
		 int x=999;
         System.out.println(this.x);	
		
	}

}
