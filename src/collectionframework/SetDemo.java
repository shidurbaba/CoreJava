package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

public static void main(String[] args) {
	//HashSet - Does not maintain order
	Set<String> set = new HashSet <String>();
	set.add("Mercedes");
	set.add("Audi");
	set.add("Ferrari");
	set.add("Lamborgini");
	set.add("Mercedes");
	
	//LinkedHashSet - It maintains the order in which the elements are added
	Set<String> set1 = new LinkedHashSet <String>();
	set1.add("Mercedes");
	set1.add("Audi");
	set1.add("Ferrari");
	set1.add("Lamborgini");
	set1.add("Mercedes");
	
	
	//TreeSet - It maintains the natural order of sorting 1,2,3
		Set<String> set2 = new LinkedHashSet <String>();
		set2.add("Mercedes");
		set2.add("Audi");
		set2.add("Ferrari");
		set2.add("Lamborgini");
		set2.add("Mercedes");

	/*System.out.println(set);*/
	System.out.println("This will print HashSet");
	for(String hashsets : set) {
		System.out.println(hashsets);
	}
	System.out.println("This will print LinkedHashSet");
	for(String linkedhashset : set1) {
		System.out.println(linkedhashset);
	}
	System.out.println("This will print TreeSet");
	for(String treeset : set2) {
		System.out.println(treeset);
	}
}
}
