package com.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RHAJELA on 5/13/2017.
 */
public class LexicographicalNumbers {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();

        helper(n, 0, result);

        return result;
    }

    private void helper(int n, int prefix, List<Integer> result) {
        for (int i = 0; i <= 9; i++) {
            int val = prefix * 10 + i;
            if (val > n) {
                return;
            }
            if (val != 0) {
                result.add(val);
                helper(n, val, result);
            }
        }


    }
}
