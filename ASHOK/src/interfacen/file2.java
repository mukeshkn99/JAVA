package interfacen;

public class file2 implements full,file3{

	public static void main(String[] args) {
		file2 f2=new file2();
f2.call();
f2.call1();
	}

	@Override
	public void run() {
		
		System.out.println("hi");
	}

	@Override
	public void call() {
		System.out.println("hlo");
	}

	@Override
	public void run1() {
		// TODO Auto-generated method stub
		System.out.println("how");
	}

	@Override
	public void call1() {
		// TODO Auto-generated method stub
		System.out.println("r u");
	}

}
