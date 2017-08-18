package com.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by RHAJELA on 8/18/2017.
 */
public class MeetingRooms2 {

    public int minMeetingRooms(Interval[] intervals) {


        //the same can be achieved using priority queue of minimum end times.


        int rooms = 0;

        Arrays.sort(intervals, new Comparator<Interval>() {

            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        ArrayList<Integer> endTimes = new ArrayList<Integer>();

        for(int i = 0; i< intervals.length; i++) {
            boolean needRoom = true;
            for(int j = 0; j< endTimes.size() ; j++) {
                if(endTimes.get(j) <= intervals[i].start) {
                    needRoom = false;
                    endTimes.set(j,intervals[i].end);
                    break;
                }
            }
            if(needRoom) {
                endTimes.add(intervals[i].end);
                rooms++;
            }
        }

        return rooms;
    }
}
