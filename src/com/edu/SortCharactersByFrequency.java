package com.edu;

import java.util.*;

/**
 * Created by Rachita on 9/22/2017.
 */
public class SortCharactersByFrequency {

    @SuppressWarnings("Since15")
    public String frequencySort(String s) {
        if (s.length() < 3) return s;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });

        pq.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()) {
            Map.Entry e = pq.poll();

            for(int i =0; i< (int)e.getValue(); i++) {
                sb.append(e.getKey());
            }
        }
        return sb.toString();


        //another solution, bucket and hashmap

        /*char[] arr = s.toCharArray();

        // bucket sort
        int[] count = new int[256];
        for(char c : arr) count[c]++;

        // count values and their corresponding letters
        Map<Integer, List<Character>> map = new HashMap<>();
        for(int i = 0; i < 256; i++){
            if(count[i] == 0) continue;
            int cnt = count[i];
            if(!map.containsKey(cnt)){
                map.put(cnt, new ArrayList<Character>());
            }
            map.get(cnt).add((char)i);
        }

        // loop throught possible count values
        StringBuilder sb = new StringBuilder();
        for(int cnt = arr.length; cnt > 0; cnt--){
            if(!map.containsKey(cnt)) continue;
            List<Character> list = map.get(cnt);
            for(Character c: list){
                for(int i = 0; i < cnt; i++){
                    sb.append(c);
                }
            }
        }
        return sb.toString();*/
    }
}
