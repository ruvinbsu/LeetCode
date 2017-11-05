package com.leetcode.stringmanipulation.easy;

/**
 * Created by ruvinyusubov on 04/11/2017.
 */
public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()){
            return false;
        }

        int[] a = new int[50];
        for (int i = 0; i < t.length(); i++){
            a[(int)(t.charAt(i)) - 97]++;
        }

        for (int i = 0; i < s.length(); i++){
            if (a[(int)(s.charAt(i)) - 97] == 0){
                return false;
            }
            a[(int)(s.charAt(i)) - 97]--;
        }

        return true;
    }
}
