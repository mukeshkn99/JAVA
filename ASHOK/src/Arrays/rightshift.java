package Arrays;

public class rightshift {

	public static void main(String[] args) {
		int[] v={5,4,2,8};
		int n=2;
for(int i=0;i<n;i++){
 int j;
	int temp=v[v.length-1];
	for(j=v.length-1;j>0;j--){
	 v[j]=v[j-1];
	}
v[0]=temp;
}
for(int j=0;j<v.length;j++){
	System.out.println(v[j]);
}
	}
	}

