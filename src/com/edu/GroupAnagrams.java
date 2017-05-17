package com.edu;

import java.util.*;

/**
 * Created by Rachita on 5/15/2017.
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        /** faster solution **/
        List<List<String>> result = new ArrayList<List<String>>();

        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String str: strs){
            char[] arr = new char[26];
            for(int i=0; i<str.length(); i++){
                arr[str.charAt(i)-'a']++;
            }
            String ns = new String(arr);

            if(map.containsKey(ns)){
                map.get(ns).add(str);
            }else{
                ArrayList<String> al = new ArrayList<String>();
                al.add(str);
                map.put(ns, al);
            }
        }

        result.addAll(map.values());

        return result;


       /* List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        int size = strs.length;
        for(String word : strs) {

            char[] characters = word.toLowerCase().toCharArray();
            Arrays.sort(characters);
            String key = new String(characters);

           if(!map.containsKey(key)) {
               map.put(key, new ArrayList<String>());
           }
            map.get(key).add(word);
        }
        result.addAll(map.values());

        return result;*/

    }
}
