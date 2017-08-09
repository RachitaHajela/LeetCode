package com.edu;

import java.util.HashMap;

/**
 * Created by RHAJELA on 8/9/2017.
 */
public class LongestAbsoluteFilePath {

    public static int lengthLongestPath(String input) {
        String[] splitDir = input.split("\n");
        HashMap<Integer,Integer> charCount = new HashMap<>();
        int level = 0;
        int maxLength = 0;
        if(splitDir[0].length() > 0) {
            charCount.put(level,splitDir[0].length());
        }

        for(int i = 1; i< splitDir.length; i++) {
            String[] splitTab = splitDir[i].split("\t");
            level = splitTab.length - 1;
            String word = splitTab[level];
            System.out.println("each word: "+ word);
            String[] name = word.split(".");
            System.out.println("name length : "+ name.length);
            if(name.length == 1) {
                charCount.put(level,charCount.get(level-1)+name[0].length());
                //System.out.println("level count : "+ charCount.get(level));
            }
            else {
                //maxLength = Math.max(maxLength,charCount.get(level-1)+ name[0].length()+ name[1].length());
            }
            //System.out.println(splitDir[i] + "tab count : "+ splitTab.length);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.print(lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
    }
}
