package Array;

public class Arraydemo {
	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 6, 1, 2, 3, 4, 5, 8 };

		System.out.println("length:" + a.length);

		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("order:");
		for (int j = 0; j < n; j++) {
			System.out.println(a[j]);
		}
		int freq[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					count++;
					freq[j] = -1;
				}
			}
			if (freq[i] != -1) {
				freq[i] = count;
			}
		}

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != -1) {
				System.out.println(a[i] + "is appeared" + freq[i]);
			}

		}

		int max = 0;
		int secondmax = 0;
		int min=0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				secondmax = max;
				max = a[i];
			}
			else if (secondmax < a[i]) {
				secondmax = a[i];
			}
			if(min>a[i]){
				min=a[i];
			}
		}
		System.out.println("maximum are:" + max);
		System.out.println("secondmaximum are:" + secondmax);
		System.out.println("minimum are:"+min);
		
		
		int l=3;
		for(int i=0;i<l;i++){
			int j=0;
			int temp=a[a.length-1];
			for( j=a.length-1;j>0;j--){
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		System.out.println("right shift are:s");
		for(int j=0;j<n;j++){
		System.out.println(a[j]);
		}
	}
}
