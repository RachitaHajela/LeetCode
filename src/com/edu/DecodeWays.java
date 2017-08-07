package com.edu;

/**
 * Created by RHAJELA on 7/31/2017.
 */
public class DecodeWays {

    public int numDecodings(String s) {
        if(s.isEmpty() || s.charAt(0) == '0') return 0;
        int ways[] = new int[s.length() + 1];
        ways[0] = 1;
        ways[1] = 1;

        for(int i=2; i<=s.length(); i++) {
            int one = Integer.parseInt(s.substring(i-1,i));
            int two = Integer.parseInt(s.substring(i-2,i));
            if(one != 0 ) {
                ways[i] += ways[i-1];
            }
            if(two  >= 10 && two <= 26) {
                ways[i] += ways[i-2];
            }
        }

        return ways[s.length()];

        /** other way :
         * int n = s.length();
         if (n == 0) return 0;

         int[] memo = new int[n+1];
         memo[n]  = 1;
         memo[n-1] = s.charAt(n-1) != '0' ? 1 : 0;

         for (int i = n - 2; i >= 0; i--)
         if (s.charAt(i) == '0') continue;
         else memo[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ? memo[i+1]+memo[i+2] : memo[i+1];

         return memo[0];
         */
    }
}
