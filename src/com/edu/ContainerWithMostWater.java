package com.edu;

/**
 * Created by Rachita on 5/11/2017.
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        /**
         *  Best solution:
         int maxArea  = 0;
         int i = 0;
         int j = height.length - 1;
         int area, mini;

         while(i<j) {
         mini = Math.min(height[i],height[j]);
         area = (j-i) * mini;
         maxArea = Math.max(maxArea,area);
         while(height[i] <= mini && i<j) i++;
         while(height[j] <= mini && i<j) j--;

         }
         return maxArea;
         */


            int maxArea  = 0;
            int i = 0;
            int j = height.length - 1;
            int area, mini;

            while(i<j) {
                mini = Math.min(height[i],height[j]);
                area = (j-i) * mini;
                maxArea = Math.max(maxArea,area);
                if(height[i] > height[j]) j--;
                else i++;
            }
            return maxArea;
            /*
            Brute Force gives TLE
            int breadth = 0;
            int length = 0;
            int total = height.length;

            for(int i = 0; i< total-1; i++) {
                for(int j = 1; j< total; j++) {
                    breadth = j-i;
                    length = Math.min(height[i], height[j]);
                    maxArea = Math.max(maxArea, length * breadth);
                }
            }
            return maxArea;*/
    }
}
