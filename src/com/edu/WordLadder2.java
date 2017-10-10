package com.edu;

import java.util.*;

/**
 * Created by Rachita on 10/8/2017.
 */
public class WordLadder2 {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> dict = new HashSet<>(wordList);
        List<List<String>> result = new ArrayList<>();

        LinkedList<QItem> queue = new LinkedList<>();
        int minLength = wordList.size() + 1;

        List<String> newList = new ArrayList<>();
        newList.add(beginWord);
        queue.add(new QItem(beginWord, 1, newList));

        while (!queue.isEmpty()) {
            QItem curr = queue.poll();
            dict.remove(curr.word);
            List<String> neighbors = getNeighbors(curr.word, dict);
            int listSize = neighbors.size();
            for (int i = 0; i < listSize; i++) {
                if (neighbors.get(i).equals(endWord)) {
                    List<String> resultList = new ArrayList<>(curr.curWay);
                    resultList.add(endWord);
                    if (curr.len + 1 < minLength) {
                        result.clear();
                        result.add(resultList);
                        minLength = curr.len + 1;
                    } else if (curr.len + 1 == minLength) {
                        result.add(resultList);
                    }
                }

                List<String> tempList = new ArrayList<>(curr.curWay);
                tempList.add(neighbors.get(i));
                queue.add(new QItem(neighbors.get(i), curr.len + 1, tempList));
            }
        }

        return result;
    }

    private List<String> getNeighbors(String word, Set<String> dictionary) {
        List<String> neighBorList = new ArrayList<>();
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char original = chars[i];
            for (char tem = 'a'; tem <= 'z'; tem++) {
                if (tem != original) {
                    chars[i] = tem;
                    String newWord = new String(chars);
                    if (dictionary.contains(newWord)) {
                        System.out.print("Neighbors of " + word + " :" + newWord);
                        neighBorList.add(newWord);
                    }
                }
            }
            chars[i] = original;
        }

        System.out.print("\n");

        return neighBorList;
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
            this.curWay = pastWords;
            this.len = l;
        }
    }
}
