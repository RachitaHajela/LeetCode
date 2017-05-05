package com.edu;

/**
 * Created by RHAJELA on 5/2/2017.
 */
public class ReverseString {
    public String reverseString(String s) {
        /** using char array **/
        if(s == null) return s;
        char[] arrChar = s.toCharArray();
        int size = arrChar.length;

        for (int i = 0, j= size-1; i<j; i++, j--) {
            char temp = arrChar[i];
            arrChar[i] = arrChar[j];
            arrChar[j] = temp;
        }

        return new String(arrChar);

        /* extremely slow
        StringBuilder sb  = new StringBuilder();
        for(int i = 0; i< s.length(); i++) {
            sb.insert(0,s.charAt(i));
        }
        return sb.toString();

        //or

         return new StringBuilder(s).reverse().toString();



        */
    }
}
