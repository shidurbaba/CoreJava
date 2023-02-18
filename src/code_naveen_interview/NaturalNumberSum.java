package code_naveen_interview;

public class NaturalNumberSum {
    public static void main(String[] args) {


        int a = 100;
        int sum = 0;
        int sum_1 = 0;
// 1+2+3+4....5050
        for(int i = 1; i <= a; i++)
        {
            sum = sum + i;
        }

        System.out.println(sum);

        int k =1;

        while(k<=a)
        {
            sum_1 = sum_1 +k;
            k++;
        }
        System.out.println(sum);
    }
}
