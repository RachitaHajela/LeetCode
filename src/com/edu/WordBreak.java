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
        for(int i = 0; i< listSize ; i++) {
            set.add(wordDict.get(i));
        }
        return breakHelper(s,set);
    }

    private boolean breakHelper(String s, HashSet<String> set) {
        boolean canBreak = false;
        int size = s.length();
        for(int i = 1; i<size-1 ; i++) {
            String temp = s.substring(0,i);
            if(set.contains(temp)) {
                if(breakHelper(s.substring(i,size),set)) {
                    return true;
                }
            }
        }
        return false;
    }
}
