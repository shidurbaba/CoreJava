package code_naveen_interview;

public class CharacterIsAlphabetOrNot {


    public static void main(String[] args) {

        char c = '$';

        if((c >= 'a' && c<='z')|| (c >= 'A' && c<= 'Z'))
        {
            System.out.println("It is an alphabet");
        }else
        {
            System.out.println("It is not alphabet");
        }

    }
}
