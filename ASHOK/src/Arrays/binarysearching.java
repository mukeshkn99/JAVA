package Arrays;

public class binarysearching {

	public static void main(String[] args) {
		binarysearching bn=new binarysearching();
          int position=bn.run();
	if(position>0)
		System.out.println("present:"+position);
	else
		System.out.println("not present");
	
	}
	int run() {
		int[] ab={1,18,56,78,90,97};
		int min=0;
		int max=ab.length-1;
		int key=18;
		while(min<=max){
		int mid=(min+max)/2;
		if(key==ab[mid]){
			return mid;
		}
		else if(key<ab[mid]){
			max=mid-1;
		}
		else{
			min=mid+1;
		}
		
	}
   return-1;
		}
	}


