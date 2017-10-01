package com.edu;

import java.util.ArrayList;

/**
 * Created by Rachita on 9/30/2017.
 */
@SuppressWarnings("ALL")
public class BaseballGame {
    public int calPoints(String[] ops) {
        ArrayList<Integer> scores = new ArrayList<>();

        for (String s : ops) {
            switch (s) {
                case "C":
                    scores.remove(scores.size() - 1);
                    break;
                case "D":
                    scores.add(2 * scores.get(scores.size() - 1));
                    break;
                case "+":
                    scores.add(scores.get(scores.size()-1)+scores.get(scores.size()-2));
                    break;
                default:
                    scores.add(Integer.parseInt(s));
            }
        }
        int sum = 0;
        for(int i : scores) {
            sum += i;
        }

      // int z =  scores.stream().reduce(0, (x,y) -> x+y);

        return sum;
    }
}
