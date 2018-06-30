package stringmanipulation;

public class ReverseString {
public static void main(String[] args) {
	
	String phrase = "Hello World ABCD"; 
	/*//length of this array will be 3
	String [] ary1 = phrase.split("\\s");
	
	//size of the index is 2, otherwise the program will through arrayoutofboundexception
	for(int i = ary1.length-1; i >= 0; i--) {
		System.out.print(ary1[i] + " ");
	}
	
	String [] ary2 = phrase.split("\\S");
	
	for(int j = ary2.length-1; j >=0; j++) {
		System.out.println( ary2[j]+" ");
	}*/
	int indexlength = phrase.length()-1;
	String reverse = "";
	
	for(int i = indexlength; i >=0; i--) {
		reverse += phrase.charAt(i);
	}
	
	System.out.println(reverse);
	
}
	
}
