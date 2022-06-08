package searching;

public class binary1 {
	public int run(){
	int[] a={65,123,456};
	int min=0;
	int max=a.length-1;
	while(min<=max){
		int key=12;
	int mid=(min+max)/2;
	if(key==a[mid]){
		return mid;
	}
	else if(key<a[mid]){
		min=mid+1;
	}
	
	}
	return -1;
	}
	public static void main(String[] args) {
	binary1 b1=new binary1();
	int print=b1.run();
	if(print>0){
		System.out.println("correctt");
	}
	else{
		System.out.println("not");
	}
	}

}
