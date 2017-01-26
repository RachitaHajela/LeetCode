package com.edu;

/**
 * Created by RHAJELA on 8/22/2016.
 */
public class ClimbStairs {

    public static int climbStairs(int n) {
        int a =0;
        int b= 1;
        int c=a+b;
        for(int i=1;i<=n;i++) {
            c = a+b;
            a=b;
            b=c;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.print(climbStairs(1));
    }
}
