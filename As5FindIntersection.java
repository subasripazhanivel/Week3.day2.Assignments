package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class As5FindIntersection {

	public static void main(String[] args) {

		int arr[] = { 3, 2, 11, 4, 6, 7 };
		int arr1[] = { 1, 2, 8, 4, 9, 7 };

		Set<Integer> arrList1 = new LinkedHashSet<Integer>();
		Set<Integer> arrList2 = new LinkedHashSet<Integer>();

		for (Integer list1 : arr) {

			arrList1.add(list1);

		}

		for (Integer list2 : arr1) {

			arrList2.add(list2);

		}

		arrList1.retainAll(arrList2);
		System.out.println("Common Numbers in the array:" + arrList1);

	}

}
