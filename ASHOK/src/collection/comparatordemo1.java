package collection;

import java.util.Comparator;

public class comparatordemo1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int i1=(int)o1;
		int i2=(int)o2;
		if(i1>i2){
			return+1;
		}
		else if(i1<i2){
			return -1;
		}
		else{
		return 0;
	}
	}
}
