package com.leetcode.recursion.medium;


import java.util.*;
/**
 * Created by ruvinyusubov on 25/11/2017.
 */
public class WordBreak_139 {
    Map<String, Boolean> segmentedIncorrectly = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        return isSegmentedCorrectly(s, wordDict);
    }

    public boolean isSegmentedCorrectly(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return true;
        }

        if (segmentedIncorrectly.getOrDefault(s, false)) {
            return false;
        }

        for (int i = 0; i < wordDict.size(); i++) {
            if (isWordInStr(wordDict.get(i), s)) {
                if (isSegmentedCorrectly(s.substring(wordDict.get(i).length(), s.length()), wordDict)) {
                    return true;
                }
            }
        }

        segmentedIncorrectly.put(s, true);
        return false;
    }

    public boolean isWordInStr(String word, String s) {
        if (word.length() > s.length()) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != s.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
