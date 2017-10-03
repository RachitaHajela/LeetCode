package com.edu;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by RHAJELA on 10/3/2017.
 */
public class MaximumLengthOfPairChain {

    public int findLongestChain(int[][] pairs) {
        if (pairs.length < 1) return 0;
        int maxLen = 1;

        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int currIndex = 0;
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > pairs[currIndex][1]) {
                currIndex = i;
                maxLen++;
            }
        }
        return maxLen;
    }
}
