package com.edu;

/**
 * Created by RHAJELA on 9/21/2017.
 */
public class ReverseWordsInAString2 {
    public void reverseWords(char[] s) {
        reverseHelper(s, 0, s.length - 1);

        int low = 0;
        int high = 0;
        int n = s.length;
        while (high < n) {
            if (s[high] == ' ') {
                reverseHelper(s, low, high - 1);
                low = high + 1;
                high = low + 1;
            } else {
                high++;
            }
        }
        reverseHelper(s, low, high - 1);
    }

    private void reverseHelper(char[] s, int i, int j) {
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

}
