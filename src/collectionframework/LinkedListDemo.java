package collectionframework;


import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList <String> cars = new LinkedList<String>();
		cars.add("Audi");
		cars.add("Mercedes");
		cars.add("Honda");
		
		
		int size = cars.size();
		System.out.println("The length of the array is " + size);
		for(int i = 0; i < size; i++) {
			System.out.println(cars.get(i));
		}
		
		System.out.println("This is for each loop");
		for(String car : cars) {
			System.out.println(car);
		}
		
		//Remove
		cars.remove(size-1);
		System.out.println("This is for each loop");
		for(String car : cars) {
			System.out.println(car);
		}
	}
}
