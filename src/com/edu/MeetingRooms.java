package com.edu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by RHAJELA on 8/17/2017.
 */
public class MeetingRooms {

    public boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i].start < intervals[i-1].end) return false;
        }
        return true;
    }
}
