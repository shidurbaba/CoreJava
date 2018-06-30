package arrayexamples;

public class SmallestAndLargestArray {

	public static void main(String[] args) {

		/*int numbers[] = { -1000, -10000, 1, 3, 9, -1, 13, 113 };*/
		
		int numbers[] = {-10,24,50,-88,124578};

		int largenumber = numbers[0];
		int smallnumber = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largenumber) {
				largenumber = numbers[i];
			} else if (numbers[i] < smallnumber) {
				smallnumber = numbers[i];
			}
		}
		System.out.println("My large number is " + largenumber);
		System.out.println("My small number is " + smallnumber);
	}

}
