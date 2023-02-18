package code_naveen_interview;

import java.util.Scanner;

public class checkLeapYear {

    public static void main(String[] args) {


       /*
       *  If the year is divisible by 4, it may be a leap year, but not always.
       * If it is also divisible by 100, it is not a leap year, unless it is divisible by 400.
       *  Finally, the program displays a message indicating whether the year is a leap year or not.
       * */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }


    }

