package com.edu;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by RHAJELA on 3/15/2017.
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new LinkedList<List<Integer>>();

        if(numRows > 0) {
            List<Integer> elements = new LinkedList<Integer>();
            elements.add(1);
            triangle.add(elements);
        }
        for(int i = 1; i<numRows ; i++) {
            List<Integer> elements = new LinkedList<Integer>();
            List<Integer> prevElements = triangle.get(i-1);
            for(int k = 0; k<= i ; k++) {
                if(k == 0 || k == i) {
                    elements.add(1);
                }
                else {
                    elements.add(prevElements.get(k-1)+prevElements.get(k));
                }
            }
            triangle.add(elements);
        }

        return triangle;
    }
}
