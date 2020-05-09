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

    // Check how many times isValid is called with an incorrect check.

    // We would need to set up a private static int counter variable. This is so every method in the class can refer to this variable. 
    // The isValid method will be changed so that before the isValid method returns false, it would increment the counter variable. 
    // It's also good to create a getter method for this counter variable so that this value can be accessed outside the class.
    
    /*** Part B Sample Response *****/



    // To modify the CheckDigit class to keep track of how many times isValid is called, 
    // I would add a private static int variable called timesCalled because a static variable
    // would belong to the class itself, eliminating the need to instantate an object.
    // The isValid method would be modified so that if the check digit is incorrect,
    // the timesCalled variable would be incrememted before the boolean is returned.
    // I would also create a getTimesCalled method that would return timesCalled so that the value
    // can be accessed outside the class.



    // with type int in the isValid class.
    // We can make this counter variable ++ every time in the else statement when false is returned, counting the number of times an incorrect check is made.
    // create a counter variable with type int in the isValid class in the else statement to count the number of times false is returned.
    

    // There may be variables and methods not shown.
}