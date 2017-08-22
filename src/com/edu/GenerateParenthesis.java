package com.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RHAJELA on 8/21/2017.
 */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        StringBuilder sb = new StringBuilder("");
        int left = 0;
        int right = 0;
        helper(result,sb,left,right,n);
        return result;
    }

    private void helper(List<String> result, StringBuilder sb, int left, int right, int n ) {
        if(right == n) {
            result.add(sb.toString());
            return;
        }
        if(right == left) {
            sb.append("(");
            helper(result,sb,left+1,right,n);
            sb.deleteCharAt(sb.length()-1);
        }
        else if (left == n) {
            sb.append(")");
            helper(result,sb,left,right+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
        else {
            sb.append("(");
            helper(result,sb,left+1, right,n);
            sb.deleteCharAt(sb.length()-1);
            sb.append(")");
            helper(result,sb,left,right+1,n);
            sb.deleteCharAt(sb.length()-1);
        }


        /**
         * simplest:
         *
         * if(str.length() == max*2){
         list.add(str);
         return;
         }

         if(open < max)
         backtrack(list, str+"(", open+1, close, max);
         if(close < open)
         backtrack(list, str+")", open, close+1, max);
         */
    }
}
