package com.edu;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Rachita on 3/3/2017.
 */
public class StackUsingQueue {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public StackUsingQueue() {
    queue1 = new LinkedList<>();
    queue2 = new LinkedList<>();

    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(queue1.size() == 0) {
            queue1.add(x);
            while(queue2.size() != 0) {
                int val = queue2.remove();
                queue1.add(val);
            }
        }
        else {
            queue2.add(x);
            while(queue1.size() != 0) {
                int val = queue1.remove();
                queue2.add(val);
            }
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue1.size() > 0 ? queue1.remove() : queue2.remove();  //can also change the name pf the queues while swapping.
    }

    /** Get the top element. */
    public int top() {
        return queue1.size() > 0 ? queue1.peek() : queue2.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
            if(queue1.size() ==0 && queue2.size() == 0) return true;
            return false;
    }

    public static void main(String[] args) {

    }
}
