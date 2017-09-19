package com.edu;

/**
 * Created by RHAJELA on 9/19/2017.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] arr = new char[26];

        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']  += 1;
        }

        for(int i = 0; i < t.length(); i++) {
            arr[t.charAt(i)-'a']  -= 1;
        }

        for(int i = 0; i < 26; i++) {
            if( arr[i]  != 0) return false;
        }
        return true;

        /*char s1[] = new char[26];

        for(char c: s.toCharArray()){

            s1[c - 'a'] ++;
        }


        for (char c: t.toCharArray() ){
            s1[c -'a']--;

        }

        for( int i = 0; i< 26;  i++ ){
            if (s1[i] != 0){
                return false;
            }
        }

        return true;*/

    }
}
