package Collection;

import java.util.Comparator;

public class compareemp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		employee e1=(employee)o1;
		employee e2=(employee)o2;
		if(e1.eno>e2.eno){
			return 1;
		}
		else if(e1.eno<e2.eno){
			return -1;
		}
		else{
		return 0;
	}

}
}