package code_naveen_interview;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("before swapping: ");
        System.out.println("value of a: " +a);
        System.out.println("value of b: " +b);

       /* int temp;
        temp = a; //10
        a = b; //20
        b = temp; //10*/

        //without temp var:

        a = a-b;
        b = a+b;
        a = b-a;

        System.out.println("after swapping: ");
        System.out.println("value of a: " +a);
        System.out.println("value of b: " +b);




    }
}
