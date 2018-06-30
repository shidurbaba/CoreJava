package stringmanipulation;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		// Find the missing odd number

		int numbers[] = { 1, 3, 7 }; //11
		int value = 0;

		for (int i = 0; i < numbers.length; i++) {
			value = value + numbers[i];
		}

		System.out.println(value);

		int value1 = 0;
		/*for (int x = 1; x <= 7; x++) {
			if (x == 2 || x == 4 || x == 6) {
				continue;
			}
			value1 += x;
		}
*/
		Set <Integer> storeoddnumbers = new HashSet<Integer>();
		
		
		for(int oddnumber :  ) {
			
		}
		
		System.out.println(value1);

		System.out.println("The missing odd number is ---- " + (value1 - value));		
			
			
		}
		
		
		
	}


