package com.edu;

import java.util.HashMap;

/**
 * Created by RHAJELA on 8/9/2017.
 */
public class LongestAbsoluteFilePath {

    public static int lengthLongestPath(String input) {
        String[] splitDir = input.split("\n");
        HashMap<Integer, Integer> charCount = new HashMap<>();
        int maxLength = 0;
        charCount.put(0,0);
        for(String s : splitDir) {
            int level = s.lastIndexOf('\t') + 1;
            System.out.println("level: "+ level);
            int len = s.length() - level;
            if (s.contains(".")) {
                maxLength = Math.max(maxLength, charCount.get(level) + len);
            } else {
                charCount.put(level + 1, charCount.get(level) + len + 1);
            }

        }
        return maxLength;
       /* for (int i = 1; i < splitDir.length; i++) {
            String[] splitTab = splitDir[i].split("\t");
            if(splitTab.length ==1) {
                splitTab = splitDir[i].split("  ");
            }
            System.out.println("splitTab Len: "+splitTab.length);
            level = splitTab.length - 1;
            String word = splitTab[level];
            System.out.println("each word:" + word);

            boolean isFile = false;
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == '.') {
                    isFile = true;
                }
                count++;
            }
            if (isFile) {
                maxLength = Math.max(maxLength, charCount.get(level - 1) + count);
                System.out.println("Maxlength: " + maxLength);
            } else {
                charCount.put(level, charCount.get(level - 1) + count+1);
            }
        }

        return maxLength;*/
    }

    public static void main(String[] args) {
        System.out.print(lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
    }
}
