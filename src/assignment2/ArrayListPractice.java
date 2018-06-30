package assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(50);
	
		for (int i = 0; i < 50; i++) {
			int input = i;
			list.add(input);
		}
		
		int size = list.size();
		for(int x = 0 ; x < size; x++) {
			if(list.contains(list.toString().contains("699"))) {
				System.out.println("The List contains number 699");
				break;
			}else {
				System.out.println("The List does not contains number 699");
				break;
			}
			
		}
	
	}

}
