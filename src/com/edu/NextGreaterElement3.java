package com.edu;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by RHAJELA on 5/24/2017.
 */
public class NextGreaterElement3 {
    public int nextGreaterElement(int n) {
        char[] number = (n+"").toCharArray();
        int i,j;
        // I) Start from the right most digit and
        // find the first digit that is
        // smaller than the digit next to it.
        for(i=number.length-1; i > 0; i--) {
            if(number[i-1] < number[i]) {
                break;
            }
        }
        //if no such digit found, return -1
        if(i == 0) return -1;

        // II) Find the smallest digit on right side of (i-1)'th
        // digit that is greater than number[i-1]
        int x = number[i-1]; int smallest = i;
        for(j =i; j<number.length; j++) {
            if(number[j] > x && number[j] <= number[smallest]) {
                smallest = j;
            }
        }
        // III) Swap the above found smallest digit with
        // number[i-1]
        char temp = number[i-1];
        number[i-1] = number[smallest];
        number[smallest] = temp;

        // IV) Sort the digits after (i-1) in ascending order
        Arrays.sort(number,i,number.length);

        long val = Long.parseLong(new String(number));
        return (val <= Integer.MAX_VALUE ? -1 : (int) val);

        /* this is correct but gives TLE
        nt min = Integer.MAX_VALUE;
        String s  = n+"";
        ArrayList<String> resList = permutation(s);

        for(int i =0; i< resList.size(); i++) {
            int num = Integer.parseInt(resList.get(i));
            if(num > n) {
                if(num < min) {
                    min = num;
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;*/
    }

    private ArrayList<String> permutation(String s) {
        ArrayList<String> res = new ArrayList<>();
        if(s.length() == 1) {
            res.add(s);
        }else if (s.length() > 1) {
            int lastIndex = s.length() - 1;
            String last = s.substring(lastIndex);
            String rest = s.substring(0,lastIndex);
            res = merge(permutation(rest),last);
        }
        return res;
    }

    private ArrayList<String> merge(ArrayList<String> list, String c) {
        ArrayList<String> res = new ArrayList<>();

        for(String s: list) {
            for(int i = 0; i<= s.length(); i++) {
                String ps = new StringBuffer(s).insert(i,c).toString();
                res.add(ps);
            }
        }
        return res;
    }
}
