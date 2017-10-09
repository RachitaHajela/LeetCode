package com.edu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Rachita on 10/7/2017.
 */
public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        LinkedList<QItem> queue = new LinkedList<>();
        queue.add(new QItem(beginWord, 1));
        HashSet<String> visited = new HashSet<>();
        visited.add(beginWord);

        while (!queue.isEmpty()) {
            QItem curr = queue.poll();
            wordList.remove(curr.word);
            int listSize = wordList.size();
            for (int i = 0; i < listSize; i++) {
                if (!visited.contains(wordList.get(i)) && isAdjacent(curr.word, wordList.get(i))) {
                    if (wordList.get(i).equals(endWord)) {
                        return curr.len + 1;
                    }
                    queue.add(new QItem(wordList.get(i), curr.len + 1));
                    visited.add(wordList.get(i));
                }
            }
        }
        return 0;
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

        QItem(String w, int l) {
            this.word = w;
            this.len = l;
        }
    }
}
