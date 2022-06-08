package project1;



public class Arraydemo {

	public static void main(String[] args) {
		Arraydemo ad=new Arraydemo();
		 int position=ad.run();
			if(position>0)
				System.out.println("present:"+position);
			else
				System.out.println("not present");
			
			}
private int run(){
	int[] al={1,3,2,4,2,6,7,5,4,6,7};
	int min=0;
	int max=al.length-1;
	int key=1;
	while(min<max){
		
		int mid=(min/max)/2;
		if(key==al[mid]){
			return mid;
		}
		else if(key<al[mid]){
			max=mid-1;
		}
		else{
			min=mid+1;
		}
		
	}
	return -1;
}
		
	}

	
