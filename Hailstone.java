public class Hailstone

{

    /**
     * Returns the length of a hailstone sequence that starts with n,
     * 
     * as described in part (a).
     * 
     * Precondition: n > 0
     * 
     */

    public static int hailstoneLength(int n)

    {
        /* to be implemented in part (a) */

        int counter = 0;

        while (n != 1) {
            if (n % 2 == 1) {
                n = n / 3 + 1;
            } else {
                n = n / 2;
            }
            counter++;
        }

        return counter;

    }

    /**
     * Returns true if the hailstone sequence that starts with n is considered long
     * 
     * and false otherwise, as described in part (b).
     * 
     * Precondition: n > 0
     * 
     */

    public static boolean isLongSeq(int n)

    {
        /* to be implemented in part (b) */ 
    
        

    }

    /**
     * Returns the proportion of the first n hailstone sequences that are considered
     * long,
     * 
     * as described in part (c).
     * 
     * Precondition: n > 0
     * 
     */

    public static double propLong(int n)

    {
        /* to be implemented in part (c) */ }

    // There may be instance variables, constructors, and methods not shown.

}

/**
 * Returns the length of a hailstone sequence that starts with n,
 * 
 * as described in part (a).
 * 
 * Precondition: n > 0
 * 
 */