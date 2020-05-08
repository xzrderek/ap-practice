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