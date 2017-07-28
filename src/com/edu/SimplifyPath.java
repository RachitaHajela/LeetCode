package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Rachita on 7/26/2017.
 */
public class SimplifyPath {

    @SuppressWarnings("Since15")
    public String simplifyPath(String path) {
        String[] list = path.split("/");
        Stack<String> stack = new Stack<>();

        for(int i = 0; i< list.length ; i++) {
            if(!stack.isEmpty() && list[i].equals("..")) {
                stack.pop();
            }
            else if (!list[i].equals("") && !list[i].equals("..") && !list[i].equals(".")) {
                stack.push(list[i]);
            }
        }
        List<String> newPath = new ArrayList<>(stack);
        return "/" ;//+ String.join("/",newPath);

       /* StringBuilder sb = new StringBuilder("/");
        ArrayList<String> dirList  = new ArrayList<>();

        int i =0;
        while(i < path.length()) {
            if(path.charAt(i) != '/' && path.charAt(i) != '.') {
                StringBuilder dirName = new StringBuilder(path.charAt(i));
                i++;
                while(path.charAt(i) != '/' || i == path.length()) {
                    dirName.append(path.charAt(i));
                    i++;
                }
                dirList.add(dirName.toString());
            }
            if (path.charAt(i) == '.' && (i > 0) && path.charAt(i-1) == '.') {
                if(dirList.size() > 1) {
                    dirList.remove(dirList.size()-1);
                }
            }
            i++;
        }
        for(int j = 0; j < dirList.size()-1; j++) {
            sb.append(dirList.get(j) + "/");
        }
        if(!dirList.isEmpty())
        {sb.append(dirList.get(dirList.size()-1));}
        return sb.toString();*/
    }
}
