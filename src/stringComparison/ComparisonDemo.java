package stringComparison;

public class ComparisonDemo {


    public static void main(String[] args) {

        String var1 = "HELLOWORLD";
        String var2 = "helloworld";

        boolean x  = isUpperString(var2);

        printValidationMessage(x);

    }

    private static void printValidationMessage(boolean x) {
        if(x != false)
        {
            System.out.println("characters are all upper case");
        }else
            {
                System.out.println("characters are all lower case");

            }
    }

    private static boolean isUpperString(String str) {
        char[] charArray = str.toCharArray();

        for(int i=0; i < charArray.length; i++){

            //if the character is a letter
            if( Character.isLetter(charArray[i]) ){

                //if any character is not in upper case, return false
                if( !Character.isUpperCase( charArray[i] ))
                    return false;
            }
        }
        return true;
    }
}
