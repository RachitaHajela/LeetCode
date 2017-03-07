package com.edu;

import java.util.Arrays;

/**
 * Created by Rachita on 2/28/2017.
 */
public class Heaters {

    public static int findRadius(int[] houses, int[] heaters) {
        int radius = 0;
        /** Greedily search for the closest heater **/
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int heaterIdx = 0;

        for(int house : houses) {
            while(heaterIdx != heaters.length-1 && Math.abs(heaters[heaterIdx+1] - house) <= Math.abs(heaters[heaterIdx]-house)){
                heaterIdx++;
            }
            radius = Math.max(radius,heaters[heaterIdx]-house);
        }


        /***** ************/
       // or use Arrays.binarySearch();

        /* Search ALL : basic
        Arrays.sort(heaters);
        for(int i = 0; i<houses.length; i++) { //for each house calculate least distance heater.
            int leastDis = Integer.MAX_VALUE;

            for(int j = 0; j< heaters.length; j++) { //calculate distance
                if(Math.abs(houses[i] - heaters[j])<leastDis) {
                    leastDis = Math.abs(houses[i]-heaters[j]);
                }
            }
            if(radius < leastDis) {
                radius = leastDis;
            }
        }*/

        return radius;
    }
    public static void main(String[] atgs) {
        int[] houses = {1,2,3,4};
        int[] heaters = {1};
        System.out.println(findRadius(houses,heaters));
    }
}
