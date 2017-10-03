package com.edu;

/**
 * Created by Rachita on 10/1/2017.
 */
public class RotateFunction {

    public int maxRotateFunction(int[] A) {
        if(A.length <= 1) return 0;
        int n = A.length;
        int sum = 0;
        int candidate  = 0;

        for(int i = 0; i<n; i++) {
            sum += A[i];
            candidate += A[i] * i;
        }
        int best = candidate;

        for(int i = n-1; i > 0; i--) {
            candidate = candidate + sum - A[i] * n;
            best = Math.max(candidate,best);
        }
        return best;
       /*  This gives TLE
       int curr = 0;
        while (curr < n) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += ((curr+i)%n)*A[i];

            }
            max = Math.max(max, sum);
            curr++;
        }*/
       // return max;
    }
}
