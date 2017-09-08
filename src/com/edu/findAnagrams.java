package com.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by RHAJELA on 9/8/2017.
 */
public class findAnagrams {

    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> res = new ArrayList<>();

        //frequency of each character in pattern :
        int[] countP = new int[256];
        for(char c : p.toCharArray()) {
            countP[c]++;
        }
        int left = 0;
        int right = 0;
        int N = s.length();
        int M = p.length();
        int count = M;

        while(right < N) {

            if(countP[s.charAt(right)] >= 1) {
                count --;
            }
            countP[s.charAt(right)]--;
            right++;

            if(count == 0) res.add(left);

            if(right-left == M) {
                if(countP[s.charAt(left)] >= 0) {
                    count++;
                }
                countP[s.charAt(left)]++;
                left++;
            }
        }
        return res;

        /* Gives TLE
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        while (i <= s.length() - p.length()) {
            if (isAnagram(p, s.substring(i, i + p.length()))) {
                res.add(i);
            }
            i++;
        }
        return res;*/
    }

    private boolean isAnagram(String a, String b) {
        char[] temp1 = a.toCharArray();
        Arrays.sort(temp1);
        char[] temp2 = b.toCharArray();
        Arrays.sort(temp2);
        for (int i = 0; i < temp1.length; i++) {
            if (temp1[i] != temp2[i]) {
                return false;
            }
        }

        return true;
    }
}
