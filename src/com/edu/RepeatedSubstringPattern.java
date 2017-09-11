package com.edu;

/**
 * Created by RHAJELA on 9/11/2017.
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        //Best Solution :
        /*int len = str.length();
        for(int i=len/2 ; i>=1 ; i--) {
            if(len%i == 0) {
                int m = len/i;
                String subS = str.substring(0,i);
                int j;
                for(j=1;j<m;j++) {
                    if(!subS.equals(str.substring(j*i,i+j*i))) break;
                }
                if(j==m)
                    return true;
            }
        }
        return false;*/





        if (s.length() == 0 || s.length() == 1) return false;
        int i = 0;
        while (i < s.length()) {
            String subString = s.substring(0, i + 1);
            if (isRepeated(s, subString)) {    //correct but takes too long.
                return true;
            }
            i++;
        }
        return false;
    }

    private boolean isRepeated(String s, String subString) {
        int subLen = subString.length();
        int len = s.length();
        if (subLen == len || len % subLen != 0) return false;
        for (int i = subLen; i < len; i = i + subLen) {
            String temp = s.substring(i, i + subLen);
            if (!subString.equals(temp)) return false;
        }
        return true;
    }
}
