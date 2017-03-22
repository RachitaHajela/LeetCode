package com.edu;

import java.util.HashMap;

/**
 * Created by RHAJELA on 3/7/2017.
 */
public class IsomorphicStrings {


    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        int size = s.length();

        for (int i = 0; i < size; i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) return false;
            } else if (map.containsValue(t.charAt(i))) return false;
            else map.put(s.charAt(i), t.charAt(i));
        }

        return true;

        /********* another way :  ************/
        /*int m1[256] = {0}, m2[256] = {0}, n = s.size();
        for (int i = 0; i < n; ++i) {
            if (m1[s[i]] != m2[t[i]]) return false;
            m1[s[i]] = i + 1;
            m2[t[i]] = i + 1;
        }
        return true;*/
    }

}
