package com.leetcode.implementation.medium;

/**
 * Created by ruvinyusubov on 25/11/2017.
 */
public class IsSubsequence_392 {
    public boolean isSubsequence(String s, String t) {
        int currInd = 0;
        if (s.length() == 0) {
            return true;
        }

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(currInd) == t.charAt(i)) {
                currInd++;
            }

            if (currInd == s.length()) {
                return true;
            }
        }

        return false;
    }
}
