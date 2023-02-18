package code_naveen_interview;

public class fibonacci_series {

    public static void main(String[] args) {

        int num = 10;
        int t1 = 0;
        int t2 = 1;

        for(int i = 1; i <=num; i++)
        {
            System.out.println(t1);
            int sum = t1 +t2; //0 1
            t1 = t2; // 1
            t2 = sum; // 1
        }


    }


}
