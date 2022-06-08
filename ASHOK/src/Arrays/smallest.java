package Arrays;

public class smallest {

	public static void main(String[] args) {
		int[] n={3,2,5,8};
		int i=0;
		int min=n[0];
		int secondmin=n[0];
        for(i=0;i<n.length;i++){
        	if(min>n[i]){
        		secondmin=min;
        		min=n[i];
        	}
        	else if(secondmin>n[i]){
        		secondmin=n[i];
        	}
        }
        System.out.println(min);
        System.out.println(secondmin);
	}

}
