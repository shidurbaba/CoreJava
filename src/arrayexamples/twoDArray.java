package arrayexamples;

public class twoDArray {
	public static void main(String[] args) {
		int [][] obj = new int [3][2];
		obj[0][0] = 2;
		obj[0][1] = 4;
		obj[1][0] = 6;
		obj[1][1] = 8;
		obj[2][0] = 10;
		obj[2][1] = 12;
		
		for(int row = 2; row < obj.length-1; row++) {
			for(int column = obj[2].length-1; column <obj[2].length; column++) {
				System.out.println(obj[row][column]);
			}
		}
		}
	}

