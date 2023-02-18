package code_naveen_interview;

public class LargestAmongThemselves {

    public static void main(String[] args) {
        int x = 100;
        int y = 900;
        int z = 300;

        if(x>=y && x>=z)
        {
            System.out.println("x is the greatest number");
        }else if (y >=z)
        {
            System.out.println("y is the greatest number");
        }else
        {
            System.out.println(" z is the greatest number");
        }
    }
}
