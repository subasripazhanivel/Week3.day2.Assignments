package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Assignment 3: Sort using Collections.

1.Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		

2.Get the length of the array		

3. sort the array			

4. Iterate it in the reverse order

5. print the array
		
6. Required Output: Wipro, HCL , CTS, Aspire Systems
*/

public class As3Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();

		list1.add("Aspire systems");
		list1.add("CTS");
		list1.add("Wipro");
		list1.add("HCL");

		Collections.sort(list1);
		System.out.println("Sorted list: \n" + list1);

		// reverse Order
		System.out.println("\nReversed order for the sorted list:");
		for (int i = list1.size()-1; i >= 0; i--)
			System.out.print(list1.get(i) + ", ");
		

		//reverse method2
		
		Collections.reverse(list1);
		System.out.println("\n\nReversed list with reverse() : \n" + list1);
		
	}

}
