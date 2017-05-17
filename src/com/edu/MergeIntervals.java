package com.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by RHAJELA on 5/17/2017.
 */
public class MergeIntervals {

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        int size = intervals.size();
        if (size <= 1) return intervals;

        /** sort the intervals based on start time by adding a comparator**/
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                if (i1.start != i2.start) return i1.start - i2.start;
                else return i1.end - i2.end;
            }
        });

        Interval pre = intervals.get(0);
        for (int i = 1; i < size; i++) {
            Interval curr = intervals.get(i);
            if (curr.start > pre.end) {
                result.add(pre);
                pre = curr;
            } else {
                Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
                pre = merged;
            }
        }
        result.add(pre);
        return result;
    }
}
