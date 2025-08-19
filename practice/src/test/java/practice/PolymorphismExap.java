package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PolymorphismExap {

	public static void main(String[] args) {
		List list =new ArrayList();
		List list1 =new ArrayList();
		
		list.add(28);
		list.add(26);
		list.add(21);
		list.add(52);
		list.add(9);
	
		System.out.println("complete list:  "+list);
		
	List	a=list.subList(0, 2);
		System.out.println(a);
		
		

	}

}
