package com.edu;

/**
 * Created by RHAJELA on 2/23/2017.
 */
public class CountPrimes {

    public static int countPrimes(int n) {
        /*int count = 0;
        for(int i = 2; i<n; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        return count;*/

        //Sieve of Eratosthenes O(nloglogn)
        boolean[] isPrime = new boolean[n];
        for(int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        int count = 0;
        for(int i=2; i*i < n; i++) {
            if(!isPrime[i]) continue;
            for(int j= i*i; j<n; j=j+i) {
                isPrime[j] = false;
            }
        }

        for(int i =2; i< n ; i++) {
            if(isPrime[i]) count++;
        }
        return count;
    }
    /* private static boolean isPrime(int num) {
         if(num == 2 || num == 3) return true;
         if((num % 2) == 0) return false;

         for (int  i=3; i*i <= num; i = i+2) {  //don't use Math.sqrt as it is expensive.
             if((num%i) == 0) return false;
         }
         return true;
     }*/

    public static void main(String[] args) {
        System.out.println("Count : "+countPrimes(1500000));
    }
}
