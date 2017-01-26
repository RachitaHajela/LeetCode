package com.edu;

/**
 * Created by RHAJELA on 8/11/2016.
 */
public class CountAndSay {

    public static String countAndSay(int n) {

        if (n == 1) return "1";
        else {
            String previousRes = countAndSay(n - 1);
            if (previousRes.length() == 1) {
                return "1" + previousRes.charAt(0);
        }
            char preChar = previousRes.charAt(0);
            int count = 1;
            StringBuilder result = new StringBuilder("");
            for(int i =1; i<previousRes.length();i++) {
                if(preChar == previousRes.charAt(i)) {
                    count++;
                }
                else {
                    result.append(count+""+preChar);
                    preChar = previousRes.charAt(i);
                    count=1;
                }
            }

                result.append(count+""+preChar);

            return result.toString();
        }


    }


    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
}
