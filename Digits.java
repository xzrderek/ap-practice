public class Digits {
    
    private ArrayList<Integer> digitList;

    public Digits(int num) {

        int digit;

        do {
            
            digit = num % 10;
            num = num / 10;

            digitList.add(new Integer(digit));

        } while(num > 0);

        //another option

        int digit;
        for(; num > 0; num = num / 10) {
            digit = num % 10;
            digitList.add(digit);
        }

    }

    public boolean isStrictlyIncreasing() {

        for(int i = 0; i < digitList.length() - 1; i++) {
            if(digitList.get(i).intValue() >= digitList.get(i + 1).intValue()) {
                return false;
            }
        }

        return true;

    }

}



