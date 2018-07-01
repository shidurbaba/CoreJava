package OddvsEven;

public class Evensorter {

	public static void main(String[] args) {
		
		int evenNumber = 0;
		
		for(int i = 1 ; i < 20 ; i ++) {
			if(i%2==0) {
				evenNumber = i;
				System.out.println("Even number : " + evenNumber);
			}
		}
		
	}

}
