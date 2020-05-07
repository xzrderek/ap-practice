public class APCalendar {
    /** Returns true if year is a leap year and false otherwise. */
    private static boolean isLeapYear(int year) {
        
        /* implementation not shown */ }

    /**
     * Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
     */
    public static int numberOfLeapYears(int year1, int year2) {
        /* to be implemented in part (a) */ 
        
        int counter = 0;
        
        for (int i = year1; i <= year2; i++) {
            if(isLeapYear(i) == true) {
                counter++;
            }
          }

        return counter;
    }

    /**
     * Returns the value representing the day of the week for the first day of year,
     * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
     */
    private static int firstDayOfYear(int year) {
        /* implementation not shown */ }

    /**
     * Returns n, where month, day, and year specify the nth day of the year.
     * Returns 1 for January 1 (month = 1, day = 1) of any year. Precondition: The
     * date represented by month, day, year is a valid date.
     */
    private static int dayOfYear(int month, int day, int year) {
        /* implementation not shown */ }

    /** 
     * Returns the value representing the day of the week for the given date (month,
     * day, year), where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes
     * Saturday. Precondition: The date represented by month, day, year is a valid
     * date.
     */
    public static int dayOfWeek(int month, int day, int year) {

        return (firstDayOfYear(year) + (dayOfYear(month, day, year) - 1) % 7);
        


        /* to be implemented in part (b) */ }
    // There may be instance variables, constructors, and other methods not shown.
}