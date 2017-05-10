package com.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by RHAJELA on 5/8/2017.
 */
public class FirstUniqueChar {

    public int firstUniqChar(String s) {

        /** two pass solution **/
        int freq[] = new int[26];
        for(int i = 0; i< s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for(int i =0; i< s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
        /*

        First Solution :

        HashMap<Character,Integer> map = new HashMap<>();
        int size = s.length();
        for(int i = 0; i< s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),Integer.MAX_VALUE);
            }
            else {
                map.put(s.charAt(i),i);
            }
        }
        Iterator<Integer> it = map.values().iterator();
        int min = Integer.MAX_VALUE;
        while(it.hasNext()) {
            int i = it.next();
            if(i < min) {
                min = i;
            }
        }
        if(min < Integer.MAX_VALUE) return min;
        return -1;*/
    }
}
