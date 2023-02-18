package code_naveen_interview;

import java.util.Scanner;

public class vowelOrConsonent {

    public static void main(String[] args) {

        // a e i o u

        Scanner reader = new Scanner(System.in);

        System.out.println(" Enter you alphabet: ");

        String a = reader.next();

        if(a.equalsIgnoreCase("a") ||a.equalsIgnoreCase("e")|| a.equalsIgnoreCase("i")|| a.equalsIgnoreCase("o"))
        {
            System.out.println( a + " is a vowel");
        }else
        {
            System.out.println(a + " is a consonant");
        }


    }
}
