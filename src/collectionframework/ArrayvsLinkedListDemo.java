package collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayvsLinkedListDemo {
	
	public static void runDuration(List<Integer>list, String listType) {
		System.out.println("\nBegining of the duration method for " + listType);
		for(int i = 0; i <200000; i++) {
			list.add(i);
		}
			int size = list.size();
			int elementToAdd = size + 100000;
				long startTime = System.currentTimeMillis();
		//After the duration
		/*for (int i = size; i < elementToAdd; i ++) {
			//list.add(i);
			list.add(0, i);
		}*/
		
				//Remove
		/*for(int i = 90000; i < 92000; i ++) {
			list.remove(i);
		}*/
			for(int i = 0; i < 100; i ++) {
				list.remove(i);
			}		
				
				long endTime = System.currentTimeMillis();
				long duration = startTime - endTime;
		System.out.println("Duration of the list " + listType + " is " + duration + " ms ");
	}
	
	public static void main(String[] args) {
		
		List<Integer> alist = new ArrayList<Integer>();
		List<Integer> llist = new LinkedList<Integer>();
		
		ArrayvsLinkedListDemo.runDuration(alist, "ArrayList");
		ArrayvsLinkedListDemo.runDuration(llist, "LinkedList");

		
	}

}
