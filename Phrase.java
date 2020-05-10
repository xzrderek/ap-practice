public class Phrase {
    
    private String currentPhrase;

    public Phrase(String p) {
        currentPhrase = p;
    }

    public int findNthOccurence(String str, int n) {
        
    }

    public void replaceNthOccurrence(String str, int n, String rep1) {

        int index = findNthOccurence(str, n);

        if (index != -1) {
            currentPhrase = currentPhrase.substring(0, index) + rep1 + currentPhrase.substring(index + str.length());
        }

    }

    public int findLastOccurrence(String str) {

        int counter = 1;

        while(findNthOccurence(str, counter + 1) != -1) {
            counter ++;
        }

        return findNthOccurence(str, counter);

    }

    public String toString() {
        return currentPhrase;
    }

}