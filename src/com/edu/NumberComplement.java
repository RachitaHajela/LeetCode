package com.edu;

/**
 * Created by Rachita on 2/18/2017.
 */
public class NumberComplement {

    public static int findComplement(int num) {

    String bin = Integer.toBinaryString(num);
    StringBuffer sol = new StringBuffer();

    for(int i = 0 ; i< bin.length(); i++) {
        if(bin.charAt(i) == '1') {
            sol.append('0');
        }else {
            sol.append('1');
        }
    }
    String complement = sol.toString();
    return Integer.parseInt(complement,2);

     /* other Solution.
     int i = 0;
        int j = 0;

        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
        }

        return i - num;*/
    }

    public static void main(String[] args) {
        System.out.println(findComplement(1));
    }
}
