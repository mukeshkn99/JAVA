package collection;


public class enums {

	
	public static void main(String[] args) {
		
		Actors[] a=Actors.values();
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+"-->"+a[i].getSalary());
		}

		
		
	}

}
