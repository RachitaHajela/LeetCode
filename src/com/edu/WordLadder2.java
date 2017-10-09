package com.edu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Rachita on 10/8/2017.
 */
public class WordLadder2 {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        List<List<String>> result = new ArrayList<>();
        HashSet<String> visited = new HashSet<>();
        LinkedList<QItem> queue = new LinkedList<>();
        int minLength = wordList.size()+1;

        visited.add(beginWord);
        List<String> newList = new ArrayList<>();
        newList.add(beginWord);
        queue.add(new QItem(beginWord,1, newList));
        Boolean shouldAdd = true;
        while (!queue.isEmpty()) {
            QItem curr = queue.poll();
            wordList.remove(curr.word);

            int listSize = wordList.size();
            for (int i = 0; i < listSize; i++) {
                if (!visited.contains(wordList.get(i)) && isAdjacent(curr.word, wordList.get(i))) {
                    if (wordList.get(i).equals(endWord)) {
                        List<String> resultList = new ArrayList<>(curr.curWay);
                        resultList.add(endWord);
                        if(curr.len+1 < minLength) {
                            result.clear();
                            result.add(resultList);
                            minLength = curr.len+1;
                        }
                        else if (curr.len + 1 == minLength) {
                            result.add(resultList);
                        }
                        shouldAdd = false;
                    }
                    visited.add(wordList.get(i));
                    if(shouldAdd) {
                        List<String> tempList = new ArrayList<>(curr.curWay);
                        tempList.add(wordList.get(i));
                        queue.add(new QItem(wordList.get(i), curr.len+ 1,tempList));
                    }
                }
            }
        }

        return result;
    }

    private boolean isAdjacent(String a, String b) {
        int count = 0;
        int n = a.length();
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        if (count != 1) return false;
        return true;
    }

    class QItem {
        String word;
        int len;
        List<String> curWay;

        QItem(String w, int l, List<String> pastWords) {
            this.word = w;
            curWay = pastWords;
            int len = l;
        }
    }
}
