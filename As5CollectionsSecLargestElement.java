package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class As5CollectionsSecLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {3,2,11,4,6,7};
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(Integer intList:data) {
			list.add(intList);
		}
		
		Collections.sort(list);
		System.out.println("Sorted List :"+list);
		int size=list.size();
		System.out.println("Second Largest element is :" +list.get(size-2));
	}

}
