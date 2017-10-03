package com.edu;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rachita on 9/22/2017.
 */
class Node {
    int k;
    int v;
    Node pre;
    Node next;

    public Node(int key, int value) {
        k = key;
        v = value;
    }
}

class LRUCache {

    int count;
    int capacity;
    HashMap<Integer, Node> map;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        count = 0;
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.pre = head;
    }

    public void remove(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public void addToHead(Node node) {
        node.next = head.next;
        node.next.pre = node;
        node.pre = head;
        head.next = node;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node old = map.get(key);
            int val = old.v;
            remove(old);
            addToHead(old);
            return val;
        }
        return -1;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            Node old = map.get(key);
            old.v = value;
            remove(old);
            addToHead(old);
        } else {

            Node node = new Node(key, value);
            if (count == capacity) {
                map.remove(tail.pre.k);
                remove(tail.pre);
                addToHead(node);
            } else {
                count++;
                addToHead(node);
            }
            map.put(key, node);

        }

    }
}