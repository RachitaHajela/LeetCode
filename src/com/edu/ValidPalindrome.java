package com.edu;

/**
 * Created by Rachita on 2/22/2017.
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) return true;
        int i = 0;
        int j = s.length()-1;
        while(i<=j) {
            while(i<=j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while(i<=j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if(i>j) return true;
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(isPalindrome(".,"));
    }
}
