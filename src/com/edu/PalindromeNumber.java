package com.edu;

/**
 * Created by RHAJELA on 7/27/2016.
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

      /*  if (x >= 0 && x <= 9) {
            return true;
        }
        if (x < 0) {
            x = Math.abs(x);
        }
        String num = "" + x;

        for (int i = 0, j = num.length() - 1; i <= (num.length() / 2); i++, j--) {
            if (num.charAt(i) == num.charAt(j)) {
                continue;
            } else {
                return false;
            }
        }

        return true;*/


      /* 2nd Solution without using extra memory : */
      if(x<0 || (x != 0 && x%10 == 0)) {
            return false;
        }
        int rev = 0;
        while (x > rev) {
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(78987));

    }
}



