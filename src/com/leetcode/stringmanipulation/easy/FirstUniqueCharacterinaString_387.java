package com.leetcode.stringmanipulation.easy;

/**
 * Created by ruvinyusubov on 29/10/2017.
 */
public class FirstUniqueCharacterinaString_387 {
    public int firstUniqChar(String s) {
        int[] numOfAppearences = new int[26];

        for (int i = 0; i < s.length(); i++){
            numOfAppearences[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++){
            if (numOfAppearences[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }

        return -1;
    }
}
