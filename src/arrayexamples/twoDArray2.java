package arrayexamples;

public class twoDArray2 {
public static void main(String[] args) {
	String [][] obj1 = 
		{
		{"Hello"}, //row:0 column:0
		{"World"},//row:1 column:1
		{"Jay", "Joker", "James", "Joyce", "Jacob"} //row:2 column:2
		};
	for(int row = 2; row <= obj1.length-1; row++) { //row is index at 2 
		for(int column = 0; column < obj1[2].length; column++) { //my column is indexed at 2 and the length is 5
			String value1 = (obj1[row][column]);
			String[] value2 = value1.split(",");
			for(String result : value2) {
				System.out.print(result + " ");
			}
		}
	}
}
}
