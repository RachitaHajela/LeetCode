package com.edu;

/**
 * Created by RHAJELA on 5/2/2017.
 */
public class NimGame {

    public boolean canWinNim(int n) {
        /*** this is correct but giver time limit exceeded. ***/
        /*if(n == 1 || n == 2 || n==3) return true;
        else return (!canWinNim(n-1) && !canWinNim(n-2) && !canWinNim(n-3));*/

        /** number divisible by 4.
         */
        return n % 4 != 0;
    }
}
