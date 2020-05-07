public class Delimiters {
    /** The open and close delimiters. */
    private String openDel;
    private String closeDel;

    /**
     * Constructs a Delimiters object where open is the open delimiter and close is
     * the close delimiter. Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /**
     * Returns an ArrayList of delimiters from the array tokens, as described in
     * part (a).
     */
    public ArrayList<String> getDelimitersList(String[] tokens) { /* to be implemented in part (a) */
        ArrayList<String> list = new ArrayList<String>();

        for (String x : tokens) {
            if (x.equals(openDel) || x.equals(closeDel)) {
                list.add(x);
            }
        }

        return list;
    }

    /**
     * Returns true if the delimiters are balanced and false otherwise, as described
     * in part (b). Precondition: delimiters contains only valid open and close
     * delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        /* to be implemented in part (b) */ 
    
        int opencounter = 0;
        int closecounter = 0;

        for (String x : delimiters) {
            if(x.equals(openDel)) {
                opencounter++;
            }
            if(x.equals(closeDel)) {
                closecounter++;
            }
            if(closecounter > opencounter) {
                return false;
            }
        }

        if(closecounter != opencounter) {
            return false;
        }
        else {
            return true;
        }

    }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}