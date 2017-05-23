package com.edu;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by RHAJELA on 5/19/2017.
 */
public class H_Index {

    public int hIndex(int[] citations) {
        //https://discuss.leetcode.com/topic/40765/java-bucket-sort-o-n-solution-with-detail-explanation/3
        int len = citations.length;
        int[] count = new int[len + 1];

        for (int c: citations)
            if (c > len)
                count[len]++;
            else
                count[c]++;


        int total = 0;
        for (int i = len; i >= 0; i--) {
            total += count[i];
            if (total >= i)
                return i;
        }

        return 0;

        /*Arrays.sort(citations);

        int result = 0;
        for(int i=0; i<citations.length; i++){
            int smaller = Math.min(citations[i], citations.length-i);
            result = Math.max(result, smaller);
        }

        return result;
*/
        /* Not entirely correct solution :
        Arrays.sort(citations);
        int len = citations.length;
        if(len == 0) return 0;
        int h = citations[len - 1];
        System.out.println("h is : "+h);
        int index = len-1;
        while (true && index > 0) {
            boolean possible = false;
            for (int i = 0; i < len - h; i++) {
                if (citations[i] >= h) {
                    h--;
                    break;
                }
                if (i == len - h - 1) possible = true;
                System.out.println(" possible :" + possible);
            }
            if (possible) {
                for (int i = h - 1; i < len; i++) {
                    if (citations[i] < h) {
                        h--;
                        break;

                    }
                    if(i == len-1) return h;
                }
            } else {
                index--;
                h = citations[index];
            }

        }
        return 0;*/
    }
}
