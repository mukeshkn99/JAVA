package collection;

import java.util.ArrayList;
import java.util.Collections;

public class listdemo {

	public static void main(String[] args) {
		mobile redmi=new mobile("y1",15000,6,64);
		mobile samsung=new mobile("note11",15000,4,128);
		mobile oppo=new mobile("a32",18000,8,256);
		
		ArrayList al=new ArrayList();
		al.add(redmi);
		al.add(samsung);
		al.add(oppo);
		System.out.println("Before sorting:"+al);
		comparatordemo cd=new comparatordemo();
		Collections.sort(al,cd);
		System.out.println("After sorting:"+al);

	}

}
