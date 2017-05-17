package com.edu;

import java.util.HashSet;

/**
 * Created by RHAJELA on 5/16/2017.
 */
public class LongestSubstringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {
        /** DP solution
         * vector<int> charIndex(256, -1);
         int longest = 0, m = 0;

         for (int i = 0; i < s.length(); i++) {
         m = max(charIndex[s[i]] + 1, m);    // automatically takes care of -1 case
         charIndex[s[i]] = i;
         longest = max(longest, i - m + 1);
         }

         return longest;
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
