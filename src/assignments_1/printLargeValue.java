package assignments_1;

import java.awt.print.PrinterIOException;

public class printLargeValue {

	public static void main(String[] args) {
		//int array [] = {10,103,1,15,34,1000,20};
		int a [] = {201,9,21, 78, 93, 1,5,7,45};
		
		for(int i = 0; i < a.length; i++) {
		if(a[i] > 10 && a[i] > 20) {
			System.out.println(a[i]);
		}else if (a[i] < 10 && a[i] < 20) {
			System.out.println("0");
		}
		}
		
		
	}
}
