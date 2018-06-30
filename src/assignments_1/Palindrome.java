package assignments_1;

public class Palindrome {

	public static void main(String[] args) {
		
		int a = 11;
		String integer = Integer.toString(a);
		String reverseInteger = new StringBuilder(integer).reverse().toString();
		int b = Integer.parseInt(reverseInteger);
		if(a == b) {
			System.out.println("True | Palindrome");
		}else {
			System.out.println("False | Not Palindrome");
		}
	}

}
