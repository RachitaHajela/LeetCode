package com.edu;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rachita on 9/22/2017.
 */
class LRUCache {
    HashMap<Integer,Integer> map ;
    HashMap<Integer,Integer> listIndex;
    ArrayList<Integer> list;
    int capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        listIndex = new HashMap<>();
        list = new ArrayList<>();
    }

    public int get(int key) {

    }

    public void put(int key, int value) {

    }
}