package com.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RHAJELA on 10/10/2017.
 */
public class SolveTheEquation {

    public String solveEquation(String equation) {
        String result = "No solution";
        String[] sides = equation.split("=");





        return result;
    }

    private String coeff(String x) {

        if(x.length() > 1 && x.charAt(x.length()-2) >= '0' && x.charAt(x.length()-2) <= '9')
            return x.replace("x","");

        return x.replace("x","1");
    }

    private List<String> breakIt(String s) {
        List<String> res = new ArrayList<>();
        String r = "";
        for(int i = 0; i< s.length(); i++) {
            if(s.charAt(i)== '+' || s.charAt(i) == '-') {
                if(r.length() > 0) {
                    res.add(r);
                }
            }else {
                r += s.charAt(i);
            }
        }
        res.add(r);
        return res;
    }
}
