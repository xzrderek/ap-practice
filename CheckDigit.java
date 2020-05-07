public class CheckDigit {
    /**
     * Returns the check digit for num Precondition: The number of digits in num is
     * between one and six, inclusive. num >= 0
     */
    public static int getCheck(int num) {
        /* implementation not shown */ }

    /**
     * Returns true if numWithCheckDigit is valid, or false otherwise, as described
     * in part (a) Precondition: The number of digits in numWithCheckDigit is
     * between two and seven, inclusive. numWithCheckDigit >= 0
     */
    public static boolean isValid(int numWithCheckDigit) {
        /* to be implemented in part (a) */ 
    
        if (numWithCheckDigit % 10 == getCheck(numWithCheckDigit / 10)) {
            return true;
        }
        else {
            return false;
        }

    }


    create a counter variable with type int in the isValid class in the else statement to count the number of times false is returned.
    

    // There may be variables and methods not shown.
}