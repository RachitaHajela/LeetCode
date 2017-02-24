package com.edu;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by RHAJELA on 2/23/2017.
 */
public class MinStack {
    ArrayList<Integer> stack;
    PriorityQueue<Integer> pq;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<>();
        pq = new PriorityQueue<>();
    }

    public void push(int x) {
        stack.add(x);
        pq.add(x);
    }

    public void pop() {
        if(stack.size()>0) {
           int elem =  stack.remove(stack.size()-1);
            pq.remove(elem);
        }
    }

    public int top() {
        int element = stack.get(stack.size()-1);
        return element;
    }

    public int getMin() {
        return pq.peek();
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(7);
        obj.push(10);
        obj.push(5);
        obj.push(13);
        System.out.println("Min :"+obj.getMin());
        obj.pop();
        obj.pop();
        System.out.println("Min :"+obj.getMin());
    }
}

/* 2nd Solution : use two stacks.

another solution is to push the min value to the stack itself whenver it is changed.
class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        // only push the old minimum value when the current
        // minimum value changes after pushing the new value x
        if(x <= min){
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        // if pop operation could result in the changing of the current minimum value,
        // pop twice and change the current minimum value to the last minimum value.
        if(stack.pop() == min) min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
 */

