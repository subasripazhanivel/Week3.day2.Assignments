package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class As5MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(Integer intList:arr) {
			list.add(intList);
		}
			
			Collections.sort(list);
			//int size=list.size();
			
			int j=1;
			for(Integer intList1:list)
			{
				if(j!=intList1) {
					
			System.out.println("Missing Element:"+j);
			
			break;
								
				}
				j++;
			}
			
		
	}

}
