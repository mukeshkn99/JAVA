package Arrays;

public class binarysearching1 {

	public static void main(String[] args) {
		
		binarysearching1 bs=new binarysearching1();
		int position1=bs.runner();
		if(position1>0){
			System.out.println("present");
		}
		else{
			System.out.println("not");
		}
	
}

	int runner() {
		int[] a={1,2,5,6};
		int min=0;
		int max=a.length-1;
		int key=6;
		while(min<=max){
		int mid=(min+max)/2;
		if(key==a[mid]){
			mid++;
		}
		else if(key<a[mid]){
			max=mid-1;
		}
		else{
			min=mid+1;
		}

	}
		return -1;
}		
		
}