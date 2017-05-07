package com.edu;

/**
 * Created by RHAJELA on 4/27/2017.
 */
public class HappyNumber {

    public boolean isHappy(int n) {

        /*Best Solution :

        if (n == 1) return true;
        int sum = 0;
        int digit = 0;

        while (n > 0) {
            digit = n % 10;
            sum = sum + (digit * digit);
            n = n / 10;
        }
        if (sum == 1 || sum == 7) return true;
        else if(sum < 10) return false;   //loop end condition.
        else return isHappy(sum);*/





        if (n == 1) return true;
        int count = 0;
        return happyNumberHelper(n, count);   //instead of using count use HashSet to Save all numbers occured. when Number repeats return false.
                                              // or use FLoyd Cycle detection method/
    }

    private boolean happyNumberHelper(int n, int count) {
        int sum = 0;
        int digit = 0;

        while (n > 0) {
            digit = n % 10;
            sum = sum + (digit * digit);
            n = n / 10;
        }
        if (sum == 1) return true;
        else if (count == 100) return false;
        else return happyNumberHelper(sum, count + 1);
    }

}
