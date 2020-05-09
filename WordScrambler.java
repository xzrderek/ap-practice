public class WordScrambler {
    private String[] scrambledWords;

    /**
     * @param wordArr an array of String objects Precondition: wordArr.length is
     *                even
     */

    public WordScrambler(String[] wordArr) {
        scrambledWords = mixedWords(wordArr);
    }

    /**
     * @param word1 a String of characters
     * @param word2 a String of characters
     * @return a String that contains the first half of word1 and the second half of
     *         word2
     */

    private String recombine(String word1, String word2) {
        /* to be implemented in part (a) */

        String sub1 = word1.substring(0, word1.length() / 2);
        String sub2 = word2.substring(word2.length() / 2);

        return sub1 + sub2;

    }
    // part b.
    1. private boolean checkValidLength(String word1, String word2)
    2. we would need the recombine method to be referenced within checkValidLength to produce the word we are comparing to.
    3. Some local variables include String variables to hold the word returned by recombine. We are then able to compare the lengths of String word1 and String word2 to this new local variable length to return true or false.

    /**
     * @param words an array of String objects Precondition: words.length is even
     * @return an array of String objects created by recombining pairs of strings in
     *         array words Postcondition: the length of the returned array is
     *         words.lengthw
     */

    private String[] mixedWords(String[] words) {
        /* to be implemented in part (b) */ }

    /**
     * There may be instance variables, constructors, and methods that are not
     * shown.
     */
}