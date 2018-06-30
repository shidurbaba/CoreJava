package arrayexamples;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArrayElements {

	public static void main(String[] args) {

		String girlfriendnames [] = {"Jessie", "Pamela", "Courtney", "Jessie"};
		
		Set <String> store = new HashSet<String>();
		
		for(String name : girlfriendnames) {
			if(store.add(name) != true) {
				System.out.println("duplicate value is : " + name);
			}else {
				System.out.println("Unique values are : " + name);
			}
		}
		
	}

}
