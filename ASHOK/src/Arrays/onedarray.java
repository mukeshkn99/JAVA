package Arrays;

public class onedarray {

	public static void main(String[] args) {
		
		int[] a=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=3;
		for(int i=0;i<a.length;i++){
			System.out.println("1d array a["+i+"]is: +a[i]");
		}
for(int elm:a){
	System.out.println(elm);
}
int[] b=a.clone();
for(int c:b){
	System.out.println(c);
}
	}

}
