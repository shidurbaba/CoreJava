package code_naveen_interview;

import java.util.Scanner;

public class PrintInteger {

    //print a integer entered by the user
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("please enter a number: ");

        int num = reader.nextInt();

        System.out.println("you entered: "+num);


    }
}
