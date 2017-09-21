package com.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RHAJELA on 9/21/2017.
 */
public class GrayCode {

    public static List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        if(n==0) return list;


        int mask = 1;
        for(int i = 0; i<n ; i++) {
            int index = list.size()-1;
            System.out.println("n is : "+ n + "index is : "+ index);
            for(int j = index; j>=0; j--) {
                System.out.println(list.get(j)^mask);
                list.add(list.get(j)^mask);
            }
            mask = mask << 1;
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
