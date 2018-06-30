package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

 public static void main(String[] args) {
	
	 Map<Integer, String> hshmap = new HashMap<Integer, String>();
	 hshmap.put(2, "Moses");
	 hshmap.put(1, "Monika");
	 hshmap.put(4, "Jason");
	 hshmap.put(3, "Json");
	 
	 //This has no order
	/* System.out.println("This will return all the String values from HashMap");
	 for(String names : hshmap.values()) {
		System.out.println(names);
	 }*/
	 
	 System.out.println("=====================================================");
	 /*String name = hshmap.get(3);
	 System.out.println("This will print only my one String " + name);
			 */
	 //This has order
	 /*System.out.println("Using Entry Set, I am returning the value");*/
	/* for(Map.Entry<Integer, String> names : hshmap.entrySet()) {
		 int number = names.getKey();
		 String value = names.getValue();
		 System.out.println("The key number is  " + number + " and the value is " + value);
	 }*/
	 
	 System.out.println("Using Key Set, I am returning the value");
	 
	 for(Integer keys : hshmap.keySet()) {
		 String values = hshmap.get(keys);
		 System.out.println("Keys " + keys + " Values " + values);
	 }
	 
	 //Maintains the order in which the keys and value pairs where added 
	 Map<Integer, String> linkedmap = new LinkedHashMap<Integer, String>();
	 linkedmap.put(2, "Moses");
	 linkedmap.put(1, "Monika");
	 linkedmap.put(4, "Jason");
	 linkedmap.put(3, "Json");
	 
	 System.out.println("Using KeySet, I am returning the values of LinkedHashMap");
	 for(Integer keys : linkedmap.keySet()) {
		 String values = linkedmap.get(keys);
		 System.out.println("Keys " + keys + " Values " + values);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
}
