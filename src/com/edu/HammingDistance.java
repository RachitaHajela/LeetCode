package com.edu;

/**
 * Created by RHAJELA on 2/17/2017.
 */
public class HammingDistance {

    public static int hammingDistance(int x, int y) {
       //initial solution.
        /*if (x == y) return 0;

        String xB = Integer.toBinaryString(x);
        String yB = Integer.toBinaryString(y);
        int lenX = xB.length()-1;
        int lenY = yB.length()-1;

        int count = 0;

        while(lenX >=0 && lenY >=0) {
            if(xB.charAt(lenX) != yB.charAt(lenY)) {
                count++;
            }
            lenX--;
            lenY--;
        }
        while(lenX >= 0) {
            if(xB.charAt(lenX) == '1') count++;
            lenX--;
        }
        while(lenY >= 0) {
            if(yB.charAt(lenY) == '1') count++;
            lenY--;
        }

        return count;*/


        //sophisticated solution : do XOR
        //count bits.
        return Integer.bitCount( x ^ y);

        //if not using bitCount :
       /* int n = x ^ y;

        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;*/

    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }
}
