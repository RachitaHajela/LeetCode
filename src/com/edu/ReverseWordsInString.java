package com.edu;

/**
 * Created by Rachita on 3/10/2017.
 */
public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder("");

        int length = words.length-1;
        for(int i=length; i>0; i--) {
            sb.append(words[i].trim()+" ");
        }
        if(length >= 0)sb.append(words[0]);

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("1 "));
    }
}
