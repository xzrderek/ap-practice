public class SelfDivisor {
    
    public static boolean isSelfDivisor(int number) {
        
        while(number != 0) {
            int bit = number % 10;
            if(bit == 0 || number % bit != 0) {
                return false;
            }
            number /= 10;
        }
        return true;

    }


    public static int[] firstNumSelfDivisors(int start, int num) {

        int[] selfdivisors = new int [num];
        for(int i = 0; i < num; i++) {
            while(!isSelfDivisor(start)) {
                start++;
            }
            selfdivisors[i] = start;
            start++;
        }
        return selfdivisors;

    }

}