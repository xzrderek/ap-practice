public interface StringChecker {
    boolean isValid(String str);
}

public class CodeWordChecker implements StringChecker {

    private int min;
    private int max;
    private String exclude;

    public CodeWordChecker(int minLength, int maxLength, String excludePhrase) {
        min = minLength;
        max = maxLength;
        exclude = excludePhrase;
    }

    public CodeWordChecker(String excludePhrase) {
        min = 6;
        max = 20;
        exclude = excludePhrase;
    }

    public boolean isValid(String str) {

        if(str.length() > max || str.length() < min) {
            return false;
        }
        if(str.contains(exclude)) {
            return false;
        }
        return true;

    }

}