package com.edu;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by RHAJELA on 5/16/2017.
 */
public class LongestSubstringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {

        /** DP solution
         if (s.length()==0) return 0;
         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
         int max=0;
         for (int i=0, j=0; i<s.length(); ++i){
         if (map.containsKey(s.charAt(i))){
         j = Math.max(j,map.get(s.charAt(i))+1);
         }
         map.put(s.charAt(i),i);
         max = Math.max(max,i-j+1);
         }
         return max;
         *
         *
         * **/


        if (s.length() <= 1) return s.length();

        int max = 0;
        int start = 0;
        HashSet<Character> set = new HashSet<Character>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);

            if (!set.contains(c)) {
                set.add(c);
                max = Math.max(max, i - start + 1);
            } else {
                for (int j = start; j < i; j++) {
                    set.remove(s.charAt(j));
                    if (s.charAt(j) == c) {
                        start = j + 1;
                        break;
                    }
                }
                set.add(c);
            }
        }
        return max;
    }
}
