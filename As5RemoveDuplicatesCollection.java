package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class As5RemoveDuplicatesCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="We learn java basics as part of java sessions in java week1 sessions";
		String[] splitStr=str.split(" ");
		
			System.out.println("\nGiven String :"+str);	
		Set<String> uniStr=new LinkedHashSet<String>();
		Set<String> dupStr=new LinkedHashSet<String>();
		
		for(String str1:splitStr) {
			if(!uniStr.add(str1))
					{
				
				dupStr.add(str1);
			}
		}
		
		System.out.println("\nUnique Words:"+uniStr);
		System.out.println("\nDuplicate Words: "+dupStr);
			
		
		System.out.println("\nString after Duplicate removal:");
		
		for(String str2:uniStr) {
			
			System.out.print(str2 +" ");
		}
	}

}
