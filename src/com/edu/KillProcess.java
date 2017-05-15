package com.edu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by RHAJELA on 5/15/2017.
 */
public class KillProcess {

    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> childList = new HashMap<>();

        int size = ppid.size();
        for(int i = 0; i < size; i++) {
            if(childList.containsKey(ppid.get(i))) {
               List<Integer> newList = childList.get(ppid.get(i));
                newList.add(pid.get(i));
                childList.put(ppid.get(i),newList);
            } else {
                List<Integer> newList = new ArrayList<>();
                newList.add(pid.get(i));
                childList.put(ppid.get(i),newList);
            }
        }


        return result;
    }
}
