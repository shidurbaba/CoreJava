package collectionframework;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	
	ArrayList <String> cars = new ArrayList<String>();
	cars.add("Audi");
	cars.add("Mercedes");
	cars.add("Honda");
	
	cars.remove(1);
	cars.add(1, "BMW");
	
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
			System.out.println("This is foreach loop");
			for(String car : cars) {
				System.out.println(car);
			}
}
}
