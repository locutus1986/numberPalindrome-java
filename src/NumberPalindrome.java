public class NumberPalindrome {
    public static boolean isPalindrome(int number){

        boolean result = false;

        //reverse number
        int placeholderNumber = number;
        int reversedNumber = 0;

        while (placeholderNumber != 0){
            int digit = placeholderNumber % 10;
            placeholderNumber /=  10;
            reversedNumber = (reversedNumber *10) + digit;
        }

        if(number == reversedNumber){
            result = true;
        }

        return result;
    }
}
