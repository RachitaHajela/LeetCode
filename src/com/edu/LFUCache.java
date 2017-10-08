package com.edu;

import java.util.HashMap;

/**
 * Created by Rachita on 10/6/2017.
 */
@SuppressWarnings("ALL")
public class LFUCache {
    int capacity, size, min;
    HashMap<Integer, Node> nodeMap;
    HashMap<Integer, DLList> countMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        nodeMap = new HashMap<>();
        countMap = new HashMap<>();
    }

    public int get(int key) {
        if (nodeMap.containsKey(key)) {
            Node node = nodeMap.get(key);
            update(node);
            return node.val;
        } else {
            return -1;
        }
    }

    private void update(Node node) {
        DLList oldList = countMap.get(node.count);
        oldList.remove(node);
        if(node.count == min && oldList.size == 0) min++;
        node.count++;
        DLList newList = countMap.getOrDefault(node.count,new DLList());
        newList.add(node);
        countMap.put(node.count,newList);

    }

    public void put(int key, int value) {
        if(capacity == 0) return;
        Node node;
        if(nodeMap.containsKey(key)) {
            node = nodeMap.get(key);
            node.val = value;
            update(node);
        }
        else {
            node = new Node(key,value);
            nodeMap.put(key,node);
            if(size == capacity) {
                DLList lastList = countMap.get(min);
                nodeMap.remove(lastList.removeLast().key);
                size--;
            }
            size++;
            min= 1;
            DLList newList = countMap.getOrDefault(node.count,new DLList());
            newList.add(node);
            countMap.put(node.count,newList);
        }
    }

    class Node {
        int key, val, count;
        Node pre, next;

        Node(int k, int v) {
            key = k;
            val = v;
            count = 1;
        }
    }

    class DLList {
        Node head, tail;
        int size;

        DLList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.pre = head;
        }

        void add(Node node) {
            node.next = head.next;
            head.next = node;
            node.pre = head;
            node.next.pre = node;
            size++;
        }

        void remove(Node node) {
            node.next.pre = node.pre;
            node.pre.next = node.next;
            size--;
        }

        Node removeLast() {
            if (size > 0) {
                Node node = tail.pre;
                remove(node);
                return node;
            } else return null;
        }
    }
}
