package Arrays;

public class practice1 {

	public static void main(String[] args) {
		practice1 p1=new practice1();
		int result=p1.run();
		if(result>0)
			System.out.println("result:"+result);
		else
			System.out.println(false);
	}
		public int run(){
		int[] a={12,13,14,16};
		int min=0;
		int max=a.length-1;
		int key=12;
		while(min<=max){
			int mid=min+max/2;
			if(key==a[mid]){
				return mid;
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
