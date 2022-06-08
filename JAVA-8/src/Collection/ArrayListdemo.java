package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListdemo {
public static void main(String[] args){
	ArrayList al=new ArrayList<>();
    al.add(new employee(12, "mukesh"));
    al.add(new employee(10,"arun"));
    al.add(new employee(6,"kalai"));
    System.out.println(al);
    Collections.sort(al,new compareemp());
    System.out.println(al);
}
}
