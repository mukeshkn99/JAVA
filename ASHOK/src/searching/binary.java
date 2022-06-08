package searching;

public class binary {

	public static void main(String[] args){
		binary b=new binary();
		int post=b.print();
		if(post>0)
			System.out.println("print");
		
		else
			System.out.println("not print");
		
	}
		private int print(){
			int[] sea={656,847,784,578,321};
			int min=0;
			int max=sea.length-1;
			int key=74;
			while(min<=max){
			int mid=(min+max)/2;
				if(key==sea[mid]){
					return mid;
				}
				else if(key<sea[mid]){
					max=mid-1;
				}
				else{
					min=mid+1;
				}
		}
		return -1;	
		}
}

