package com.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RHAJELA on 5/24/2017.
 */
public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        ArrayList<List<String>> result = new ArrayList<>();
        if (s.length() == 0) {
            result.add(new ArrayList<String>());
            return result;
        }

        addPalindrome(s, 0, new ArrayList<String>(), result);
        return result;

    }

    private void addPalindrome(String s, int start, ArrayList<String> partition, ArrayList<List<String>> result) {
        if (start == s.length()) {
            ArrayList<String> l = new ArrayList<>(partition);
            result.add(l);
            return;
        }

        for (int i = start + 1; i <= s.length(); i++) {
            String str = s.substring(start, i);
            if (isPalindrome(str)) {
                partition.add(str);
                addPalindrome(s, i, partition, result);
                partition.remove(partition.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int len = s.length();

        int left = 0;
        int right = len - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;

    }
}
