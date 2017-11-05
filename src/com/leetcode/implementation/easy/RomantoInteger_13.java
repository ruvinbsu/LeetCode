package com.leetcode.implementation.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ruvinyusubov on 05/11/2017.
 */
public class RomantoInteger_13 {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> letterToNumber = new HashMap<>();

        letterToNumber.put('I', 1);
        letterToNumber.put('V', 5);
        letterToNumber.put('X', 10);
        letterToNumber.put('L', 50);
        letterToNumber.put('C', 100);
        letterToNumber.put('D', 500);
        letterToNumber.put('M', 1000);

        if (s.length() == 1){
            return letterToNumber.get(s.charAt(0));
        }
        int i = 1;
        while (i < s.length()) {
            if (letterToNumber.get(s.charAt(i)) > letterToNumber.get(s.charAt(i - 1))){
                res += letterToNumber.get(s.charAt(i)) - letterToNumber.get(s.charAt(i - 1));
                if (s.length() - 1 == i + 1){
                    return res + letterToNumber.get(s.charAt(i + 1));
                }

                i++;
            }
            else{
                res += letterToNumber.get(s.charAt(i - 1));
                if (i + 1 == s.length()){
                    res += letterToNumber.get(s.charAt(i));
                }
            }

            i++;
        }

        return res;
    }
}
