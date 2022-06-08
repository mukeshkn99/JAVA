package Arrays;



public class largest {

	public static void main(String[] args) {
		 int[] a={1,2,5,4,8,0};
	      int i=0;
	      int max=a[i];
	      int secondmax=a[i];
	      for(i=0;i<a.length;i++){
	          if(max<a[i]){
	              secondmax=max;
	              max=a[i];
	          
	      }
	    
	      
	      else if(secondmax<a[i]){
	          secondmax=a[i];
	      }
	      }
	      System.out.println("first largest:"+max);
	      System.out.println("second largest:"+secondmax);
	    }
	}