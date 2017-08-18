package com.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RHAJELA on 8/14/2017.
 */
public class LetterCombinationsOfPhoneNumber {

    public List<String> letterCombinations(String digits) {
        String[] list = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        dfs(digits,list,0,temp,result);
        return result;
    }

    private void dfs(String digits, String[] list, int level, StringBuilder temp, List<String> result) {
        if(level == digits.length()) {
            result.add(temp.toString());
            return;
        }
        String letters = list[digits.charAt(level - '0')];
        for(int i = 0; i< letters.length(); i++) {
            temp.append(letters.charAt(i));
            dfs(digits,list,level+1,temp,result);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
