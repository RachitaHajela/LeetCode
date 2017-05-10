package com.edu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by RHAJELA on 5/10/2017.
 */
public class PalindromePermutation {

    public boolean canPermutePalindrome(String s) {
        /*** using hashset **/

        HashSet<Character> set = new HashSet<Character>(s.length());

        for (int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);

            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        return set.size() <= 1;



       /* boolean oddFlag = false;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i< s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 == 0) continue;
            if(entry.getValue() % 2 != 0 && !oddFlag) {
                oddFlag = true;
            }
            else {
                return false;
            }
        }
        return true;*/
    }
}
