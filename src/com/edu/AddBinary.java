package com.edu;

/**
 * Created by RHAJELA on 8/18/2016.
 */
public class AddBinary {

    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder("");
        int aLen = a.length()-1;
        int bLen = b.length()-1;
        int i=0;
        int carry = 0;

        while(i<=aLen || i<= bLen || carry==1) {
            int x = i<=aLen ? Character.getNumericValue(a.charAt(aLen-i)) : 0;
            int y = i<=bLen ? Character.getNumericValue(b.charAt(bLen-i)) : 0;
            int result = (x+y+carry)%2;
            carry = (x+y+carry)/2;
            res.insert(0,result);
            i++;
        }

        return res.toString();
    }

    public static void main(String[] args) {

        System.out.println(addBinary("11", "1"));
    }
}


