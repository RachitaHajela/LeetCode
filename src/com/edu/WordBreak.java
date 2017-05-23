package com.edu;

import java.util.HashSet;
import java.util.List;

/**
 * Created by Rachita on 5/18/2017.
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {

        HashSet<String> set = new HashSet<>();
        int listSize = wordDict.size();
        for (int i = 0; i < listSize; i++) {
            set.add(wordDict.get(i));
        }
       return wordHelperDP(s,set);
        //return breakHelper(s, set); returns in TLE
    }

    private boolean wordHelperDP(String s, HashSet<String> set) {

        int len = s.length();
        boolean[] pos = new boolean[len+1];
        pos[0] = true;

        for(int i = 0; i< len; i++) {
            for(int j=i+1; pos[i] && j<=len; j++) {
                if(set.contains(s.substring(i,j))) {
                    pos[j] = true;
                }
            }
        }
    return pos[len];
    }

    private boolean breakHelper(String s, HashSet<String> set) {
        if (set.contains(s)) return true;
        int size = s.length();
        for (int i = 1; i < size; i++) {
            String temp = s.substring(0, i);

            if (set.contains(temp)) {
                if (breakHelper(s.substring(i, size), set)) {
                    return true;
                }
            }
        }
        return false;
    }
}
