package com.edu;

/**
 * Created by RHAJELA on 8/1/2016.
 */
public class ValidParanthesis {
    public static boolean isValid(String s) {
        StringBuilder sb = new StringBuilder("");
        int size = s.length();
        if (size == 0 || size % 2 != 0) {

           // System.out.println("size == 0 || size % 2 != 0");
            return false;
        }

        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                   // System.out.println(c);
                    sb.append(c);
                    break;
                case ')':
                    if ((sb.length() > 0) && (sb.charAt(sb.length() - 1)) == '(') {
                        sb.deleteCharAt(sb.length() - 1);
                       // System.out.println("deleting" + c+ " "+ sb.length());

                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if ((sb.length() > 0) && (sb.charAt(sb.length() - 1)) == '{') {
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if ((sb.length() > 0) && (sb.charAt(sb.length() - 1)) == '[') {
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }

        if (sb.length() == 0)
        {return true;}
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isValid("()({})[]"));


    }
}
