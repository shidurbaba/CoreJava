package code_naveen_interview;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("please enter a number: ");

        int num = reader.nextInt();

        if(num%2 == 0)
        {
            System.out.println(num + " is even");
        }else
        {
            System.out.println(num + " is odd");
        }
    }
}
