package collection;

import java.util.Comparator;

public class comparatordemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		mobile m1=(mobile)o1;
		mobile m2=(mobile)o2;
		int result=m1.model.compareTo(m2.model);
		if(m1.price<m2.price){
			return -1;
		}
		else if(m1.price>m2.price){
			return +1;
		}
		else{
			if(m1.gb<m2.gb){
				return -1;
			}
			else if(m1.gb>m2.gb){
				return +1;
			}
		}
		return 0;
	}

}
