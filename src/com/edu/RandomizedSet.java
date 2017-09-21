package com.edu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by RHAJELA on 9/20/2017.
 */
public class RandomizedSet {
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;
    Random rand;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val,list.size());
        list.add(val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;

        int loc = map.get(val);
        if(loc != list.size()-1) {
            list.set(loc,list.get(list.size()-1));
            map.put(list.get(list.size()-1),loc);
        }
        map.remove(val);
        list.remove(list.size()-1);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}