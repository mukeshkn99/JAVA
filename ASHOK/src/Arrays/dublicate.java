package Arrays;

public class dublicate {

	public static void main(String[] args) {
		int [] p1={1,2,3,6,4,8,9,4,6,9};
		int i;
		int[] p2=new int[p1.length];
		int[] freq=new int[p1.length];
for( i=0;i<p1.length;i++){
	//int no=p1[i];
	int count=1;
	for(int j=i+1;j<p1.length;j++){
	if(p1[i]==p1[j]){
		count++;
		freq[j]=-1;
	}
	if(freq[i]!=-1){
		freq[i]=count;
	}
}
	}
int dub=0;
for(i=0;i<freq.length;i++){
	if(freq[i]>1){
		dub++;
		
		

	}
}
System.out.println(dub);
	}
}
