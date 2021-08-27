package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class As4RemoveDuplicates {

	public static void main(String[] args) {
		// Declare a String as PayPal India
		String str = "PayPal India";

		// 1.Convert it into a character array
		char[] CharArr = str.toCharArray();

		// 2.Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<Character>();

		// 3.Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupChar = new LinkedHashSet<Character>();

		// 4.Iterate character array and add it into charSet
		for (Character arr : CharArr) {

			// 5.If the character is already in the charSet then, add it to the dupCharSet

			if (!charSet.add(arr)) {
				dupChar.add(arr);
			}
		}
		//System.out.println("Unique Character in the set :" + charSet);
		System.out.println("Duplicate Characters: " + dupChar);

		// 6.Check the dupCharSet elements and remove those in the charSet

		for (Character arr1 : dupChar) {
			charSet.remove(arr1);
		}

		System.out.println("Charset after dublicate removal: "+charSet);

		// 7.Iterate using charSet
		System.out.print("Unique Characters in the given Sting :");
		for (Character arr2 : charSet) {

			// 8.Check the iterator variable isn't equals to an empty space
			if (!arr2.equals(' ')) {

				// 9.print it
				System.out.print(arr2);
			}

		}

	}

}
