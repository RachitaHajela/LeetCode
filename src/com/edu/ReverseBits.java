package com.edu;

/**
 * Created by Rachita on 2/25/2017.
 */
public class ReverseBits {

    public static int reverseBits(int n) {
        /*String reverse = Integer.toBinaryString(n);
        StringBuffer sb = new StringBuffer();
        int j = reverse.length();
        int size = j;
        while(size<32) {
            sb.append('0');
            size++;
        }
        System.out.println("original : "+sb.toString());
        for (int i = j-1; i >= 0; i--) {
            sb.append(reverse.charAt(i));
        }

        System.out.println("reverse: "+sb.toString());
        int result = Integer.parseInt(sb.toString(), 2);
        return result;*/

        if(n==0) return 0;
        int result = 0;
        for(int i=0; i<32; i++) {
            result = result << 1;
            if(( n & 1) == 1) result++;
            n = n>>1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(reverseBits(43261596));
    }
}
