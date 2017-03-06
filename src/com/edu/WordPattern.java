package com.edu;

import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by RHAJELA on 3/6/2017.
 */
public class WordPattern {

    public static boolean wordPattern(String pattern, String str) {
        String[] tokens = str.split(" ");
        if (pattern.length() != tokens.length) return false;
        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < tokens.length; i++) {
            char expr = pattern.charAt(i);
            if (map.containsKey(expr)) {
                if (!map.get(expr).equals(tokens[i])) return false;
            } else {
                if (map.containsValue(tokens[i])) return false;
                map.put(expr, tokens[i]);
            }
        }
        return true;

        /*** Map.put returns the previous value associated with key, or null
         *  String[] words = str.split(" ");
         if (words.length != pattern.length())
         return false;
         Map index = new HashMap();
         for (Integer i=0; i<words.length; ++i)
         if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
         return false;
         return true;
         */
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }
}
