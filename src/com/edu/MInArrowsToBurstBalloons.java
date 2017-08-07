package com.edu;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by RHAJELA on 8/5/2017.
 */
public class MInArrowsToBurstBalloons {

    public int findMinArrowShots(int[][] points) {
        if(points.length <= 1) return points.length;

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] - o2[0] == 0) {
                    return o1[1] - o2 [1];
                }
                else return o1[0] - o2[0];
            }
        });
        int result = 1;
        int end = points[0][1];

        for(int i = 1; i < points.length; i++) {
            if(points[i][0] <= end ) {
                end = Math.min(end, points[i][1]);
            }
            else {
                result ++;
                end = points[i][1];
            }
        }
        return result;


        /**
         *  the sorting can be adjusted so that there's no need to check again in the for loop.

         Idea:
         We know that eventually we have to shoot down every balloon, so for each ballon there must be an arrow whose position is between balloon[0] and balloon[1]. Given that, we can sort the array of balloons by their ending position.
         Then we make sure that while we take care of each balloon from the beginning, we can shoot as many following balloons as possible.


         public int findMinArrowShots(int[][] points) {
         if (points.length == 0) {
         return 0;
         }
         Arrays.sort(points, (a, b) -> a[1] - b[1]);
         int arrowPos = points[0][1];
         int arrowCnt = 1;
         for (int i = 1; i < points.length; i++) {
         if (arrowPos >= points[i][0]) {
         continue;
         }
         arrowCnt++;
         arrowPos = points[i][1];
         }
         return arrowCnt;
         }


         */


    }
}
