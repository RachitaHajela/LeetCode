package com.edu;

/**
 * Created by Rachita on 2/28/2017.
 */
public class Heaters {

    public static int findRadius(int[] houses, int[] heaters) {
        int radius = 0;

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
        }

        return radius;
    }
    public static void main(String[] atgs) {
        int[] houses = {1,2,3,4};
        int[] heaters = {1};
        System.out.println(findRadius(houses,heaters));
    }
}
