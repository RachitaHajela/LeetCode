package com.edu;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by RHAJELA on 9/12/2017.
 */
public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> retList = new LinkedList<Integer>();
        retList.add(1);

        for(int i = 1; i<=rowIndex ; i++) {
            List<Integer> element = new LinkedList<Integer>();
            for(int k = 0; k<= i ; k++) {
                if(k == 0 || k == i) {
                    element.add(1);
                }
                else {
                    element.add(retList.get(k-1)+retList.get(k));
                }
            }
            retList = element;
        }

        return retList;
    }
}
